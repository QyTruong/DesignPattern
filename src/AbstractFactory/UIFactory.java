package AbstractFactory;

public abstract class UIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
    public void applyTheme(){
        Button button = this.createButton();
        Checkbox checkbox = this.createCheckbox();
        button.render();
        checkbox.render();
    }
}
