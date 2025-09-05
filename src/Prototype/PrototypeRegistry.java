package Prototype;

import java.util.HashMap;

public class PrototypeRegistry {
    private static HashMap<String, Prototype> registry = new HashMap<>();

    public static void addPrototype(String key, Prototype prototype){
        registry.put(key, prototype);
    }

    public static Prototype getPrototype(String key){
        Prototype prototype = registry.get(key);
        return prototype != null ? prototype.cloneChar() : null;
    }
}
