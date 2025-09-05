package Decorator;

public class FireEnchantment extends WeaponDecorator{
    public FireEnchantment(Weapon weapon, int dmgBuff) {
        super(weapon, dmgBuff);
    }

    @Override
    public String getDescription() {
        return this.weapon.getDescription() + "with fire ";
    }

    @Override
    public int getDamage() {
        return this.weapon.getDamage() + this.dmgBuff;
    }
}
