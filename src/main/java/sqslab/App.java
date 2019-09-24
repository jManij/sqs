package sqslab;


public class App {
    public static void main(String[] args) {
        if (args.length > 2) {
            System.out.println("Wrong input. Exiting Code");
            return;
        }

        Client client = new Client();

        client.sendMessage("", 'A');

    }

}
