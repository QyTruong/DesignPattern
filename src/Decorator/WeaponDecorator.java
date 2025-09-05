package Decorator;

public abstract class WeaponDecorator implements Weapon{
    protected Weapon weapon;
    protected int dmgBuff;

    public WeaponDecorator(Weapon weapon, int dmgBuff){
        this.weapon = weapon;
        this.dmgBuff = dmgBuff;
    }
}
