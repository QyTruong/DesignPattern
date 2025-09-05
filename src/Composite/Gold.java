package Composite;

public class Gold extends Item {

    public Gold(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Extra " + this.name);
    }
    
}
