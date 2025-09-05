package Prototype;

public class Boss extends NonPlayerCharacter{

    public Boss(String name, int level, int atk, int hp) {
        super(name, level, atk, hp);
    }

    @Override
    public Prototype cloneChar() {
        return new Boss(this.name, this.level, this.atk, this.hp);
    }
}
