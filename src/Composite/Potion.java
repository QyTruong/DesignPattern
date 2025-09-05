package Composite;

public class Potion extends Item{
    
    public Potion(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Drink " + this.name);
    }    
}
