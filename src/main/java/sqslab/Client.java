package sqslab;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;
import com.amazonaws.services.sqs.model.SendMessageRequest;

import java.util.List;

public class Client {
    public Client() {
    }

    /**
     * Receives message and URL notation to send messages
     * @param message - message that needs to be sent
     * @param URL - the char representing the URL it is going to
     */
    public void sendMessage(String message, char URL) {
        String queueURL = getURL(URL);

        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        SendMessageRequest send_msg_request = new SendMessageRequest()
                .withQueueUrl(queueURL)
                .withMessageBody(message)
                .withDelaySeconds(5);
        sqs.sendMessage(send_msg_request);
        System.out.println("The following message: '"+ message + "' is sent!");

    }

    /**
     * Receives URL notation (in char) to receive the message from
     * @param URL
     */

    public void receiveMessage(char URL) {
        String queueUrl = getURL(URL);
        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        List<Message> messages = sqs.receiveMessage(queueUrl).getMessages();


        for (Message message: messages) {
            System.out.println("Message received: " + message.getBody());
            sqs.deleteMessage(queueUrl, message.getReceiptHandle());
        }
    }

    /**
     * Get URLs needed to send the message to the queues
     * @param URL
     * @return
     */
    private String getURL(char URL) {
        URL url = new URL();
        String sqsURL = "";
        switch (URL){
            case 'A':
                for (int i = 0; i < 5000; i++) {
                    sqsURL = url.getQueueUrl_A();
                }
                break;

            case 'B':
                sqsURL = url.getQueueUrl_B();
                break;

            case 'C':
                sqsURL = url.getQueueUrl_C();
                break;

        }
        return sqsURL;
    }

}
