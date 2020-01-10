package unittest;

import org.junit.Assert;
import org.junit.Test;

public class MessageProcessorTest1841720125Falah {
    MessageProcessor1841720125Falah mProcessor;
    public MessageProcessorTest1841720125Falah(){
        mProcessor=new MessageProcessor1841720125Falah();
        mProcessor.setSender("Ronaldo");
        mProcessor.setRecipient("Rafael");
        mProcessor.setMessage("Whats up Bro?");
    }
    
    @Test
    public void testShowMessageFalah(){
        String expectedResult = "Hai Rafael, you have message from Ronaldo.\nThe message as follows: Whats up bro?";
       Assert.assertEquals(expectedResult,mProcessor.messageFormatFalah());
       }
}
