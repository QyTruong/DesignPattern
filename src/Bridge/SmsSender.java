package Bridge;

public class SmsSender implements MessageSender{

    @Override
    public String sendMessage(String content) {
        return String.format("Message(sms): %s", content);
    }
    
}
