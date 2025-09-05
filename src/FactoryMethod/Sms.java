package FactoryMethod;

public class Sms implements Notification{
    @Override
    public void execute() {
        System.out.println("Send via sms");
    }
}
