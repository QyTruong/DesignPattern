package Bridge;

public class EmailSender implements MessageSender{

    @Override
    public String sendMessage(String content) {
        return String.format("Message(email): %s", content);
    }
}
