package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<String, TreeType> pool = new HashMap<>();

    public static TreeType getTreeType(String type, String texture, String color, double height){
        String key = type + "_" + texture + "_" + color + "_" + height;
        if (pool.containsKey(key))
            return pool.get(key);
        TreeType treeType = new TreeType(type, texture, color, height);
        pool.put(key, treeType);
        return treeType;
    }

    public static Tree getTree(double xPoint, double yPoint, TreeType treeType){
        return new Tree(xPoint, yPoint, treeType);
    }
}
