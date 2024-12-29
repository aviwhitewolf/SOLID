package Factory.Components;

public class IosButton implements Button {

    private String text;

    public IosButton() {
        this.text = "Button";
    }

    @Override
    public void onClick() {
        System.out.println("Ios Button clicked");
    }

    @Override
    public void text(String text) {
        this.text = text;
    }

    @Override
    public void render() {
        System.out.println("Ios Button rendered with text: " + this.text);
    }
}
