//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;

public class MobileFactoryPattern extends abstractFactoryPattern {
    Device getGadget(DeviceType deviceType)
    {
        return switch (deviceType) {
            case Nokia -> new Nokia("6gb", "Helios");
            case OnePlus -> new Oneplus("12gb", "Snapdragon");
            default -> null;
        };
    }
}





