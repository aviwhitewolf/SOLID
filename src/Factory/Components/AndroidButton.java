package Factory.Components;

public class AndroidButton implements Button {

    private String text;

    public AndroidButton() {
        this.text = "Button";
    }

    @Override
    public void onClick() {
        System.out.println("Android Button clicked");
    }

    @Override
    public void text(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Android Button rendered with text: " + this.text);
    }
}
