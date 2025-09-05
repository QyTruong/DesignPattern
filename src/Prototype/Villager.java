package Prototype;

public class Villager extends NonPlayerCharacter{

    public Villager(String name, int level, int atk, int hp) {
        super(name, level, atk, hp);
    }

    @Override
    public Prototype cloneChar() {
        return new Villager(this.name, this.level, this.atk, this.hp);
    }
}
