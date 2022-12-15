//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;

public class MAIN {
    public static void main(String[] args) {

        System.out.println("\nName    : Jay Vekariya\nRoll No : 20BCP125  \n");
        Device OnePlus =FactoryGenerator.getFactory(FactoryType.MobileFactory).getGadget(DeviceType.OnePlus);
        System.out.println(OnePlus.getDetails());

        Device Nokia =FactoryGenerator.getFactory(FactoryType.MobileFactory).getGadget(DeviceType.Nokia);
        System.out.println(Nokia.getDetails());

        Device Dell =FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Dell);
        System.out.println(Dell.getDetails());

        Device HP =FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.HP);
        System.out.println(HP.getDetails());

    }
}





