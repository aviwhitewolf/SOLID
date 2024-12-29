package Factory;

import Factory.Components.Button;
import Factory.Components.Menu;
import Factory.Factory.UIComponent;
import Factory.Factory.UIComponentFactory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String platform = scanner.nextLine();
        //platform == Android -> AndroidUIComponent -> AndroidUIComponentFactory
        //platform == IOS -> IOSUIComponent -> IOSUIComponentFactory
        UIComponent uiComponent = UIComponentHelper.getUIComponentForPlatform(platform);
        UIComponentFactory uiComponentFactory = uiComponent.getFactory();

        Button button = uiComponentFactory.createButton();
        button.render();

        Menu menu = uiComponentFactory.createMenu();
        menu.render();
    }
}
