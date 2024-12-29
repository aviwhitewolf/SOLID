package Factory.Components;

public class IosMenu implements Menu {

    private String text;

    public IosMenu() {
        this.text = "Menu";
    }

    @Override
    public void onClick() {
        System.out.println("Ios Menu clicked");
    }

    @Override
    public void render() {
        System.out.println("Ios Menu rendered with text: " + this.text);
    }
}
