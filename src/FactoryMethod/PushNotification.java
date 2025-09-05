package FactoryMethod;

public class PushNotification extends NotificationFactory{
    @Override
    public Notification createMethod() {
        return new Push();
    }  
}
