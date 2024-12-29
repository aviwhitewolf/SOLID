package Factory.Factory;

import Factory.Components.Button;
import Factory.Components.IosButton;
import Factory.Components.IosMenu;
import Factory.Components.Menu;

public class IosUIComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
