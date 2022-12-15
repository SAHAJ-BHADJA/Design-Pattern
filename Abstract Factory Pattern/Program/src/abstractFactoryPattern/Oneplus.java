//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;

public class Oneplus extends Device {
    private final String ram;
    private final String processor;

    public Oneplus(String ram, String processor)
    {
        this.ram = ram;
        this.processor= processor;
    }
    public String getDetails()
    {
        return "In OnePlus phone, you get " + this.ram + " of RAM, and it has " + this.processor + " processor" ;
    }
    public String toString()
    {
        return "OP(" + "ram:" + ram + "Processor" + processor +")";
    }
}




