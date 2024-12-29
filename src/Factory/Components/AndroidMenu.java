package Factory.Components;

public class AndroidMenu implements Menu {

    private String text;

    public AndroidMenu() {
        this.text = "Menu";
    }

    @Override
    public void onClick() {
        System.out.println("Android Menu clicked");
    }

    @Override
    public void render() {
        System.out.println("Android Menu rendered with text: " + this.text);
    }
}
