package Factory.Factory;

import Factory.Components.AndroidButton;
import Factory.Components.AndroidMenu;
import Factory.Components.Button;
import Factory.Components.Menu;

public class AndroidUIComponentFactory implements UIComponentFactory {

    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
