//Name   : Jay Vekariya
//Roll No: 20BCP125

package adapterPattern;

public class Assignment {
    private pen p;
    public pen getP() {
        return p;
    }
    public void setP(pen p) {
        this.p = p;
    }
    public void writeAssignment(String str){
        p.write((str));
    }
}
