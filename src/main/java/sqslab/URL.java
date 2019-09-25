package sqslab;


public class URL {


    private String queueUrl_A = System.getenv("URL_A");
    private String queueUrl_B = System.getenv("URL_B");
    private String queueUrl_C = System.getenv("URL_C");
    private String queueARN_A = System.getenv("ARN_A");
    private String queueARN_B = System.getenv("ARN_B");
    private String queueARN_C = System.getenv("ARN_C");


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
