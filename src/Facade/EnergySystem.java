package Facade;

public class EnergySystem {
    private int hp;
    private int mana;
    private int stamina;

    public EnergySystem(int hp, int mana, int stamina){
        this.hp = hp;
        this.mana = mana;
        this.stamina = stamina;
    }

    public void consumeMana(int mana){
        if (this.mana > 0){
            System.out.println("Mana consunme -" + mana);
            this.mana -= mana;
        }
        else 
            System.out.println("Not enough mana!");
        
    }

    public void consumeStamina(int stamina){
        if (this.stamina > 0) {
            System.out.println("Stamina consunme -" + stamina);
            this.stamina -= stamina;
        }
        else 
            System.out.println("Not enough stamina!");
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getStamina() {
        return stamina;
    }
}
