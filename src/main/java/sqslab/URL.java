package sqslab;
import org.springframework.beans.factory.annotation.Value;


public class URL {

    @Value("${URL_A}")
    private  String queueUrl_A;

    @Value("${URL_B}")
    private String queueUrl_B;

    @Value("${URL_C}")
    private String queueUrl_C;

    @Value("${ARN_A}")
    private String queueARN_A;

    @Value("${ARN_B}")
    private  String queueARN_B;

    @Value("${ARN_C}")
    private String queueARN_C;


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
