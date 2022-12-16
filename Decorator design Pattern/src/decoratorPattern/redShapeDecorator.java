//Name: Jay Vekariya
//Roll No:20BCP125

package decoratorPattern;

public class redShapeDecorator extends shapeDecorator {

    public redShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){

        System.out.println("Border Color: Red");
    }
}