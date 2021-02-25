package design.patterns.creational.factory;

public class ProductFactory {

    Product createProduct(String type){
        if (type.equalsIgnoreCase("B")) {
            return new ProductB();
        } else {
            return new ProductA();
        }
    }
}
