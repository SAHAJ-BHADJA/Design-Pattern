//Name   : Jay Vekariya
//Roll No: 20BCP125

package adapterPattern;

public class School {
    public static void main(String[] args){
        pen p = new penAdapter();
        Assignment a = new Assignment();
        a.setP(p);
        a.writeAssignment("Adapter Design Pattern Assignment Demo");
    }
}
