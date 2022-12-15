//Name   : Jay Vekariya
//Roll No: 20BCP125

package adapterPattern;

public class penAdapter implements pen {
    pilotPen pen = new pilotPen();

    @Override
    public void write(String str) {
        pen.mark(str);
    }
}
