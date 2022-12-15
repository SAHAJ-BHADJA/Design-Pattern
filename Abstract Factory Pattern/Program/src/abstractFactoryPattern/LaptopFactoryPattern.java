//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;

public class LaptopFactoryPattern extends abstractFactoryPattern {
    Device getGadget(DeviceType deviceType)
    {
        return switch (deviceType) {
            case Dell -> new Dell("16gb", "AMDryzen", "NVIDIARTX");
            case HP -> new HP("12gb", "IntelEvo", "NVIDIAGTX");
            default -> null;
        };
    }
}




