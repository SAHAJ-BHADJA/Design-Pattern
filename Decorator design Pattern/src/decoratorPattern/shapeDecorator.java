//Name: Jay Vekariya
//Roll No:20BCP125

package decoratorPattern;

public abstract class shapeDecorator implements Shape {
    protected Shape decoratedShape;

    public shapeDecorator(Shape decoratedShape){

        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}