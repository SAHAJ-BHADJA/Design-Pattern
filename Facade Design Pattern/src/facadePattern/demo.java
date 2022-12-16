//Name: Jay Vekariya
//Roll No: 20BCP125

package facadePattern;

public class demo {

    public static void main(String[] args) {
	Shapemaker shapemaker = new Shapemaker();

        shapemaker.drawSquare();
        shapemaker.drawRectangle();
        shapemaker.drawCircle();
        shapemaker.drawOval();

    }
}


