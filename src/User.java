import Singleton.Connection;
import AbstractFactory.DarkThemeFactory;
import AbstractFactory.UIFactory;
import Bridge.CasualNotification;
import Bridge.EmailSender;
import Bridge.PushSender;
import Bridge.SmsSender;
import Bridge.UrgentNotification;
import Singleton.DatabaseConnectionPool;
import Builder.Character;
import Composite.Arrow;
import Composite.Bundle;
import Composite.Chest;
import Composite.Gold;
import Composite.Potion;
import Decorator.FireEnchantment;
import Decorator.IceEnchantment;
import Decorator.PoisonEnchantment;
import Decorator.Sword;
import Decorator.Weapon;
import Facade.BattleFacade;
import FactoryMethod.NotificationFactory;
import FactoryMethod.SmsNotification;
import Flyweight.Tree;
import Flyweight.TreeFactory;
import Flyweight.TreeType;
import Prototype.*;
import Proxy.*;

public class User {
    public static void main(String[] args) {
        Video video = new ProxyVideo("Hello world video");
        video.Play();
        video.Play();
    }   

    public static void flyweightTest(){
        TreeType type1 = TreeFactory.getTreeType("Oak", "Oak.png", "red", 3);
        TreeType type2 = TreeFactory.getTreeType("Oak", "Oak.png", "red", 3);
        
        Tree tree1 = TreeFactory.getTree(20, 10, type1);
        Tree tree2 = TreeFactory.getTree(15, 5, type2);
        System.out.println(tree1.getInfo());
        System.out.println(tree2.getInfo());
        System.out.println(type1 == type2);
        System.out.println(tree1 == tree2);
    }

    public static void facadeTest(){
        BattleFacade skill = new BattleFacade();
        skill.useSkill("slash");
        skill.useSkill("fireball");
    }

    public static void bridgeTest(){
        EmailSender email = new EmailSender();
        PushSender push = new PushSender();
        SmsSender sms = new SmsSender();

        Bridge.Notification urgent1 = new UrgentNotification(sms, "Hello");
        Bridge.Notification casual2 = new CasualNotification(email, "Are u enemy??");
        Bridge.Notification urgent2 = new UrgentNotification(push, "Attack!!!");
        urgent1.notifyMsg();
        casual2.notifyMsg();
        urgent2.notifyMsg();
    }

    public static void compositeTest(){
        Chest bigChest = new Chest("Big chest");
        
        Gold gold_50 = new Gold("50");

        Chest smallChest = new Chest("Small chest");
        Potion potion_hp = new Potion("HP Potion");
        Arrow arrow = new Arrow("Poison arrow");
        smallChest.addItem(potion_hp);
        smallChest.addItem(arrow);

        Bundle bundle = new Bundle("Bundle");
        Gold gold_100 = new Gold("100");
        Potion potion_mana = new Potion("Mana Potion");
        bundle.addItem(potion_mana);
        bundle.addItem(gold_100);

        bigChest.addItem(gold_50);
        bigChest.addItem(smallChest);
        bigChest.addItem(bundle);

        bigChest.use();
    }

    public static void prototypeTest(){
        Monster monster = new NPCBuilder()
                        .addName("Wolf").addLevel(5).addAttack(10).addHealth(15).buildMonster();
        PrototypeRegistry.addPrototype("monster_wolf", monster);
        
        Monster monster1 = (Monster) PrototypeRegistry.getPrototype("monster_wolf");
        Monster monster2 = (Monster) PrototypeRegistry.getPrototype("monster_wolf");

        monster2.setName("Fire wolf");

        System.out.println(monster1);
        System.out.println(monster2);
    }

    public static void decoratorTest(){
        Weapon weapon = new Sword("Attack", 10);
        System.out.println(weapon.getDescription() + " - " + weapon.getDamage() + " dmg");
        weapon = new FireEnchantment(weapon, 1);
        System.out.println(weapon.getDescription() + " - " + weapon.getDamage() + " dmg");
        weapon = new IceEnchantment(weapon, 3);
        System.out.println(weapon.getDescription() + " - " + weapon.getDamage() + " dmg");
        weapon = new PoisonEnchantment(weapon, 5);
        System.out.println(weapon.getDescription() + " - " + weapon.getDamage() + " dmg");
    }

    public static void factoryMethodTest(){
        NotificationFactory factory = new SmsNotification();
        factory.createMethod().execute();
    }

    public static void abstractFactoryTest(){
        UIFactory factory = new DarkThemeFactory();
        factory.applyTheme();
    }

    public static void builderTest(){
        Character.Builder warriorBuilder = new Character.Builder("Arthur", "Warrior")
            .addStrength(100).addWeapon("sword").addArmor("heavy armor");
        Character.Builder mageBuilder = new Character.Builder("Merlin", "Mage")
            .addIntelligence(150).addWeapon("staff").addArmor("robe");
        Character.Builder archerBuilder = new Character.Builder("Robin", "Archer")
            .addAgility(120).addWeapon("Bow").addArmor("Light armor");
        
        System.out.println(warriorBuilder.build().toString());
        System.out.println(mageBuilder.build().toString());
        System.out.println(archerBuilder.build().toString());   
    }

    public static void singletonTest(){
        Connection conn1 = DatabaseConnectionPool.getInstance().getConnection();
        Connection conn2 = DatabaseConnectionPool.getInstance().getConnection();
        Connection conn3 = DatabaseConnectionPool.getInstance().getConnection();

        conn1.execute();
        conn2.execute();
        conn3.execute();
        DatabaseConnectionPool.getInstance().releaseConnection(conn2);
        Connection conn4 = DatabaseConnectionPool.getInstance().getConnection();
        conn4.execute();
        Connection conn5 = DatabaseConnectionPool.getInstance().getConnection();
        conn5.execute();
    }
}
