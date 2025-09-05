package Prototype;

public class NPCBuilder {
    private String name;
    private int level;
    private int atk;
    private int hp;

    public NPCBuilder addName(String name){
        this.name = name;
        return this;
    }

    public NPCBuilder addLevel(int level){
        this.level = level;
        return this;
    }

    public NPCBuilder addAttack(int atk){
        this.atk = atk;
        return this;
    }

    public NPCBuilder addHealth(int hp){
        this.hp = hp;
        return this;
    }

    public Villager buildVillager(){
        return new Villager(name, level, atk, hp);
    }

    public Boss buildBoss(){
        return new Boss(name, level, atk, hp);
    }

    public Monster buildMonster(){
        return new Monster(name, level, atk, hp);
    }
}
