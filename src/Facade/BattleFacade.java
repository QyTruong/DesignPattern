package Facade;

public class BattleFacade {
    private EnergySystem energy;
    private InventorySystem inventory;
    private SoundSystem sound;
    private AnimationSystem animation;

    public BattleFacade(){
        this.energy = new EnergySystem(50, 100, 30);
        this.inventory = new InventorySystem();
        this.sound = new SoundSystem();
        this.animation = new AnimationSystem();
    }

    public void useSkill(String skillname){
        if (skillname.equals("slash"))
            slashSkill();
        if (skillname.equals("fireball"))
            fireSkill();
    }

    private void slashSkill(){
        this.energy.consumeMana(20);
        this.energy.consumeStamina(10);
        this.inventory.checkWeapon("Sword");
        this.sound.play("sword_sound");
        this.animation.play("slash");
    }

    private void fireSkill(){
        this.energy.consumeMana(30);
        this.energy.consumeStamina(5);
        this.inventory.checkWeapon("Staff");
        this.sound.play("magic_sound");
        this.animation.play("shoot");
    }
}
