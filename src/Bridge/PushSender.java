package Bridge;

public class PushSender implements MessageSender{

    @Override
    public String sendMessage(String content) {
        return String.format("Message(push): %s", content);
    }
    
}
