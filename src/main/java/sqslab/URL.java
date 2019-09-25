package sqslab;


public class URL {


    private  String queueUrl_A = "https://sqs.us-west-2.amazonaws.com/836616260696/QueueA";
    private String queueUrl_B = "https://sqs.us-west-2.amazonaws.com/836616260696/QueueB";
    private String queueUrl_C = "https://sqs.us-west-2.amazonaws.com/836616260696/QueueC";
    private String queueARN_A = "arn:aws:sqs:us-west-2:836616260696:QueueA";
    private  String queueARN_B = "arn:aws:sqs:us-west-2:836616260696:QueueB";
    private String queueARN_C = "arn:aws:sqs:us-west-2:836616260696:QueueC";


    public String getQueueUrl_A() {
        return queueUrl_A;
    }

    public String getQueueUrl_B() {
        return queueUrl_B;
    }

    public  String getQueueUrl_C() {
        return queueUrl_C;
    }

    public  String getQueueARN_A() {
        return queueARN_A;
    }

    public String getQueueARN_B() {
        return queueARN_B;
    }

    public String getQueueARN_C() {
        return queueARN_C;
    }
}
