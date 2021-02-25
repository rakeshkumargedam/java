package design.patterns.creational.factory;

public class ProductB extends Product {
    public void writeName(String name){
        StringBuilder tempName = new StringBuilder(name);
        System.out.println("My Reversed Name is : " + tempName.reverse());
    }
}
