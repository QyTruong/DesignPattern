package FactoryMethod;

public class Email implements Notification{
    @Override
    public void execute(){
        System.out.println("Send via email");
    }
}
