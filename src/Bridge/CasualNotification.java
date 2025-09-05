package Bridge;

public class CasualNotification extends Notification{

    public CasualNotification(MessageSender sender, String message) {
        super(sender, message);
    }

    @Override
    public void notifyMsg() {
        System.out.println(sender.sendMessage(message));
    }    
}
