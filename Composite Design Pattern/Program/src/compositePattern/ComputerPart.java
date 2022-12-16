// Name   : Jay Vekariya
// Roll No: 20BCP125

package compositePattern;

import java.util.ArrayList;
import java.util.List;

interface Components
{
    void showPrice();
    int getPrice();
}
class leafObject implements Components
{
    int price;
    String partName;
    leafObject(String partName, int price)
    {
        this.partName = partName;
        this.price = price;
    }
    @Override
    public void showPrice()
    {
        System.out.println("Leaf Object : "  + partName + ", and its price is " +price+ " Rs.");
    }
    public int getPrice()
    {   return price;  }
}
class compositeObject implements Components
{
    String name;
    List<Components> components = new ArrayList<>();
    public compositeObject(String name)
    {
        super();
        this.name = name;
    }
    public void addComponent(Components com)
    {  components.add(com);    }
    @Override
    public int getPrice()
    {
        int p = 0;
        for(Components c : components)
        {
            p += c.getPrice();
        }
        return p;
    }
    @Override
    public void showPrice()
    {
        System.out.println("Composite Object : " +name+ " and its total price after adding cost of all its components is " +getPrice()+ " Rs.");
        System.out.println("Leaf Objects of " +name+ " include: ");
        for(Components c : components)
        {
            c.showPrice();
        }
    }
}
public class ComputerPart {
}
