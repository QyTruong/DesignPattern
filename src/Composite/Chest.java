package Composite;

import java.util.ArrayList;
import java.util.List;

public class Chest extends Item {
    private List<Item> items = new ArrayList<>();

    public Chest(String name) {
        super(name);
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }

    @Override
    public void use() {
        System.out.println("Open: " + this.name + " --¬");
        for (Item item : items) {
            item.use();
        }
    }
}
