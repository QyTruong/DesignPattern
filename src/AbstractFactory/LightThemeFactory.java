package AbstractFactory;

public class LightThemeFactory extends UIFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightCheckbox();
    }
}
