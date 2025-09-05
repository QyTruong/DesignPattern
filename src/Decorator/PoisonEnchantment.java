package Decorator;

public class PoisonEnchantment extends WeaponDecorator{
    public PoisonEnchantment(Weapon weapon, int dmgBuff) {
        super(weapon, dmgBuff);
    }

    @Override
    public String getDescription() {
        return this.weapon.getDescription() + "with poison ";
    }

    @Override
    public int getDamage() {
        return this.weapon.getDamage() + this.dmgBuff;
    }
    
}
