package Prototype;

public class Monster extends NonPlayerCharacter{

    public Monster(String name, int level, int atk, int hp) {
        super(name, level, atk, hp);
    }

    @Override
    public Prototype cloneChar() {
        return new Monster(this.name, this.level, this.atk, this.hp);
    }
}
