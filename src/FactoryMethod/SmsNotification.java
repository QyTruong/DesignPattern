package FactoryMethod;

public class SmsNotification extends NotificationFactory{
    @Override
    public Notification createMethod() {
        return new Sms();
    }
}
