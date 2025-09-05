package Decorator;

public class Sword implements Weapon{
    private String txt;
    private int dmg;

    public Sword(String txt, int dmg){
        this.txt = txt;
        this.dmg = dmg;
    }
    
    @Override
    public String getDescription() {
        return String.format("%s ", this.txt);
    }

    @Override
    public int getDamage() {
        return this.dmg;
    }
    
}
