// Name   : Jay Vekariya
// Roll No: 20BCP125

package compositePattern;

public class CompositeTest {
    public static void main(String[] args)
    {
        Components hardDrive = new leafObject("Harddrive", 5000);
        Components mouse = new leafObject("Mouse", 700);
        Components monitor = new leafObject("Monitor", 9000);
        Components ram = new leafObject("ram", 8000);
        Components cpu = new leafObject("CPU" , 4000);

        compositeObject peripherals = new compositeObject("Peripherals");
        compositeObject cabinet = new compositeObject("Cabinet");
        compositeObject motherBoard = new compositeObject("Motherboard");
        compositeObject computer = new compositeObject("Computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        peripherals.addComponent(mouse);
        peripherals.addComponent(monitor);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);

        computer.addComponent(cabinet);
        computer.addComponent(peripherals);

        computer.showPrice();
        //ram.showPrice();                     -->individual testing can be done likewise
        //peripherals.showPrice();
    }
}
