//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;

public abstract class FactoryGenerator {
    public static abstractFactoryPattern getFactory(FactoryType ftype)
    {
        return switch (ftype) {
            case MobileFactory -> new MobileFactoryPattern();
            case LaptopFactory -> new LaptopFactoryPattern();
        };
    }
}

