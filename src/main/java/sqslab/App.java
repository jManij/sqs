package sqslab;


public class App {
    public static void main(String[] args) throws InterruptedException {

        /**
         * Validation for args input
         */
        if (args.length > 2) {
            System.out.println("Wrong input. Exiting Code");
            return;
        }

        Client client = new Client();
        int counter = 0;

        switch (args[0]) {
            case "send":
                while (counter < 1000) {
                    client.sendMessage("This is Message " + counter, args[1].toUpperCase().charAt(0));
                    Thread.sleep(200);
                    counter++;
                }
                break;


            case "receive":
                while(counter < 100) {
                    client.receiveMessage(args[1].toUpperCase().charAt(0));
                    Thread.sleep(200);
                    counter++;
                }
                break;


            default:
                System.out.println("Wrong input. Exiting Code");
        }


    }

}

