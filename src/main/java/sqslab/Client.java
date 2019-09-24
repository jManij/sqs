package sqslab;

import com.amazonaws.services.sqs.AmazonSQS;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import com.amazonaws.services.sqs.model.Message;
import com.amazonaws.services.sqs.model.SendMessageBatchRequest;
import com.amazonaws.services.sqs.model.SendMessageBatchRequestEntry;

import java.util.List;

public class Client {



    /**
     * Receives message and URL notation to send messages
     * @param message - message that needs to be sent
     * @param URL - the char representing the URL it is going to
     */
    public void sendMessage(String message, char URL) {
        String queueURL = getURL(URL);

        final AmazonSQS sqs = AmazonSQSClientBuilder.defaultClient();
        SendMessageBatchRequest send_batch_request = new SendMessageBatchRequest()
                .withQueueUrl(queueURL)
                .withEntries(
                        new SendMessageBatchRequestEntry(
                                "msg_1", "Hello from message 1"),
                        new SendMessageBatchRequestEntry(
                                "msg_2", "Hello from message 2")
                                .withDelaySeconds(10));
        sqs.sendMessageBatch(send_batch_request);
        System.out.println("Message Sent");

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
            System.out.println(message.getBody());
            sqs.deleteMessage(queueUrl, message.getReceiptHandle());
        }
    }

    /**
     * Get URLs needed to send the message to the queues
     * @param URL
     * @return
     */
    public String getURL(char URL) {
        URL url = new URL();
        String sqsURL = "";
        switch (URL){
            case 'A':
                sqsURL = url.getQueueUrl_A();
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
