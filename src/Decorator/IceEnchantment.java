package Decorator;

public class IceEnchantment extends WeaponDecorator{
    public IceEnchantment(Weapon weapon, int dmgBuff) {
        super(weapon, dmgBuff);
    }

    @Override
    public String getDescription() {
        return this.weapon.getDescription() + "with ice ";
    }

    @Override
    public int getDamage() {
        return this.weapon.getDamage() + this.dmgBuff;
    }

}
