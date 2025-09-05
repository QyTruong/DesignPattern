package Composite;

public class Arrow extends Item {

    public Arrow(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Charge " + this.name);
    }    
}
