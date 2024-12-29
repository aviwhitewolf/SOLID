package Factory.Factory;

public class AndroidUI implements UIComponent {

    public AndroidUI() {
    }

    @Override
    public void refreshUI() {
        System.out.println("Refreshing Android UI");
    }

    @Override
    public UIComponentFactory getFactory() {
        return new AndroidUIComponentFactory();
    }
}
