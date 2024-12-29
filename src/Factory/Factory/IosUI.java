package Factory.Factory;

public class IosUI  implements UIComponent{

        public IosUI() {}

        @Override
        public void refreshUI() {
            System.out.println("Refreshing IOS UI");
        }

        @Override
        public UIComponentFactory getFactory() {
            return new IosUIComponentFactory();
        }
}
