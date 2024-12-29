package Factory;

import Factory.Factory.AndroidUI;
import Factory.Factory.IosUI;
import Factory.Factory.UIComponent;

public class UIComponentHelper {
    //Practical Factory.
    public static UIComponent getUIComponentForPlatform(String platform) {
        UIComponent uiComponent = null;
        if (platform.equals("Android")) {
            uiComponent = new AndroidUI();
        } else if (platform.equals("IOS")) {
            uiComponent = new IosUI();
        }

        return uiComponent;
    }
}
