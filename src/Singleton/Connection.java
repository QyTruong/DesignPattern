package Singleton;

public class Connection {
    private String text;

    public Connection(String text){
        this.text = text;
    }

    public void execute(){
        System.out.printf("database %s working...\n", this.text);
    }
}
