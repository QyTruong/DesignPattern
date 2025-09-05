package Flyweight;

public class TreeType {
    private String type;
    private String texture;
    private String color;
    private double height;

    public TreeType(String type, String texture, String color, int height){
        this.type = type;
        this.texture = texture;
        this.color = color;
        this.height = height;
    }

    public String getInfo(){
        return String.format("Type: %s\nTexture: %s\nColor: %s\nHeight: %f\n",
                            this.type, this.texture, this.color, this.height);
    }
}
