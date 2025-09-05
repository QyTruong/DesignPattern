package Bridge;

public class UrgentNotification extends Notification{

    public UrgentNotification(MessageSender sender, String message) {
        super(sender, message);
    }

    @Override
    public void notifyMsg() {
        System.out.println("[URGENT] " + sender.sendMessage(message));
    }    
}
