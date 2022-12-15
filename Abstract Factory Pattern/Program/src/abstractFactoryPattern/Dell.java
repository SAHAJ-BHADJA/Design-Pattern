//Name: Jay Vekariya
//Roll no: 20BCP125
package abstractFactoryPattern;


public class Dell extends Device{
    private final String ram;
    private final String processor;
    private final String gpu;

    public Dell(String ram, String processor, String gpu)
    {
        this.ram = ram;
        this.processor= processor;
        this.gpu = gpu;
    }
    public String getDetails()
    {
        return "In Dell model, we have "+ this.ram + " of RAM, processor that you get is : " + this.processor + "  and you get GPU which is : " + this.gpu;
    }

    public String toString()
    {
        return "Dell(" + "ram:" + ram + "Processor" + processor + " GPU "+this.gpu +")";
    }
}


