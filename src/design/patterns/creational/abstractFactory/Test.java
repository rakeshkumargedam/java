package design.patterns.creational.abstractFactory;

public class Test {

    public static void main(String args[]) {
        //Get Rounded Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //Get an Object of Shape Rounded RECTANGLE
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        //Get an object of shape Rounded SQUARE
        Shape shape2 = shapeFactory.getShape("SQUARE");

        //call draw method
        shape1.draw();
        shape2.draw();

        // Get Rounded ShapeFactory
        AbstractFactory shapeFactory1 = FactoryProducer.getFactory(true);
        //Get an object of Shape Rectangle
        Shape shape3 = shapeFactory1.getShape("RECTANGLE");
        shape3.draw();

        //Get an Object of Shape SQUARE
        Shape shape4 = shapeFactory1.getShape("SQUARE");
        shape4.draw();


    }
}
