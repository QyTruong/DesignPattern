package Prototype;

public abstract class NonPlayerCharacter implements Prototype{
    protected String name;
    protected int level;
    protected int atk;
    protected int hp;

    public NonPlayerCharacter(String name, int level, int atk, int hp){
        this.name = name;
        this.level = level;
        this.atk = atk;
        this.hp = hp;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nLevel: %d\nAttack: %d\nHealth: %d\n",
                            this.name, this.level, this.atk, this.hp);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
