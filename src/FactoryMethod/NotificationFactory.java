package FactoryMethod;

public abstract class NotificationFactory {
    public abstract Notification createMethod();
    public void executeNotify(){
        Notification method = this.createMethod();
        method.execute();
    }
}
