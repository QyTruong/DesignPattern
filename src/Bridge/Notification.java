package Bridge;

public abstract class Notification {
    protected MessageSender sender;
    protected String message;

    public Notification(MessageSender sender, String message){
        this.sender = sender;
        this.message = message;
    }

    public abstract void notifyMsg();
}
