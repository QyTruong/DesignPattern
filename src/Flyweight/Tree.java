package Flyweight;

public class Tree {
    private double xPoint;
    private double yPoint;
    private TreeType treeType;

    public Tree(double xPoint, double yPoint, TreeType treeType){
        this.xPoint = xPoint;
        this.yPoint = yPoint;
        this.treeType = treeType;
    }

    public String getInfo(){
        return String.format("[%f, %f] %s", this.xPoint, this.yPoint, treeType.getInfo());
    }
}
