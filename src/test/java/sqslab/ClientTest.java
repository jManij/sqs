package sqslab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClientTest {

    Client client = new Client();
    @Before
    public void init() {
        client.sendMessage("hello", 'A');
        client.sendMessage("hello", 'B');
        client.sendMessage("hello", 'C');

    }

    @Test
    public void sendMessage() {
        assertEquals("There should be a confirmation","The following message: 'hello' is sent!",
                client.sendMessage("hello", 'A'));
        assertEquals("There should be a confirmation","The following message: 'hello' is sent!",
                client.sendMessage("hello", 'B'));
        assertEquals("There should be a confirmation","The following message: 'hello' is sent!",
                client.sendMessage("hello", 'C'));

    }

    @Test
    public void receiveMessage() {
        assertNotNull("The queue should return the message", client.receiveMessage('A'));
        assertNotNull("The queue should return the message", client.receiveMessage('B'));
        assertNotNull("The queue should return the message", client.receiveMessage('C'));

    }
}