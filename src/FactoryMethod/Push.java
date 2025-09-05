package FactoryMethod;

public class Push implements Notification{
    @Override
    public void execute() {
        System.out.println("Send via email");
    }
}
