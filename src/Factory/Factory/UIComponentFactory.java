package Factory.Factory;

import Factory.Components.Button;
import Factory.Components.Menu;

public interface UIComponentFactory {

        Button createButton();
        Menu createMenu();
}
