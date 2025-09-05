package FactoryMethod;

public class EmailNotification extends NotificationFactory{
    @Override
    public Notification createMethod() {
        return new Email();
    }
}
