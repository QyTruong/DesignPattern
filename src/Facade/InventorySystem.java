package Facade;

public class InventorySystem {
    private String weapon;
    private String potion;

    public InventorySystem(){

    }

    public void checkWeapon(String weapon){
        System.out.printf("Weapon %s\n", this.weapon=weapon);
    }

    public String getWeapon() {
        return weapon;
    }

    public String getPotion() {
        return potion;
    }
}
