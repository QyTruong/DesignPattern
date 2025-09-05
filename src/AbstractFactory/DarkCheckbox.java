package AbstractFactory;

public class DarkCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println("Dark check box");
    }
}
