//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;

public class Nokia extends Device {
    private final String ram;
    private final String processor;

    public Nokia(String ram, String processor)
    {
        this.ram = ram;
        this.processor= processor;
    }
    public String getDetails()
    {
        return "In Nokia phone, you get " + this.ram + " of RAM, and it has " + this.processor + " processor";
    }
    public String toString()
    {
        return "Nokia(" + "ram:" + ram + "Processor" + processor +")";
    }
}

