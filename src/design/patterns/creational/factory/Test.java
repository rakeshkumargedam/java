package design.patterns.creational.factory;

public class Test {

    public static void main(String args[]) {
        ProductFactory pf = new ProductFactory();
        Product product;
        product = pf.createProduct("A");
        product.writeName("Rakesh");
        product = pf.createProduct("B");
        product.writeName("Rakesh");
    }
}
