package az.ter.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //TODO: Get an object of circle and call its draw method.
        Shape shape = shapeFactory.getShape("CIRCLE");

        //TODO: call draw method of circle
        shape.draw();


        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
