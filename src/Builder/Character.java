package Builder;

/*
 * Có thể cải thiện pattern này bằng cách kết hợp với Director Pattern
 * => Cách hoạt động khá giống với factory pattern (việc phân phối)
 */

public class Character {
    private String name;
    private String classType;
    private int strength;
    private int intelligence;
    private int agility;
    private String weapon;
    private String armor;

    public Character(Builder b){
        this.name = b.name;
        this.classType = b.classType;
        this.strength = b.strength;
        this.intelligence = b.intelligence;
        this.agility = b.agility;
        this.weapon = b.weapon;
        this.armor = b.armor;
    }

    public static class Builder{
        private String name;
        private String classType;
        private int strength;
        private int intelligence;
        private int agility;
        private String weapon;
        private String armor;

        public Builder(String name, String classType){
            this.name = name;
            this.classType = classType;
        }

        public Builder addStrength(int strength){
            this.strength = strength;
            return this;
        }

        public Builder addIntelligence(int intelligence){
            this.intelligence = intelligence;
            return this;
        }

        public Builder addAgility(int agility){
            this.agility = agility;
            return this;
        }

        public Builder addWeapon(String weapon){
            this.weapon = weapon;
            return this;
        }

        public Builder addArmor(String armor){
            this.armor = armor;
            return this;
        }

        public Character build(){
            return new Character(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nClass: %s\nStrength: %d\nIntelligence: %d\nAgility: %d\nWeapon: %s\nArmor: %s\n",
        this.name, this.classType, this.strength, this.intelligence, this.agility, this.weapon, this.armor);
    }
}
