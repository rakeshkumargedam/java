package design.patterns.creational.abstractFactory;

public class RoundShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundRectangle();
        } else {
            if (shapeType.equalsIgnoreCase("SQUARE")) {
                return new RoundSquare();
            }
        }
        return null;
    }
}
