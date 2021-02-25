package design.patterns.creational.prototype;

import java.util.Hashtable;

/**
 * Definition
 * The Prototype pattern is basically the creation of new instances through
 * cloning existing instances. By creating a prototype, new objects are created
 * by copying this prototype.
 * Where to use
 * •When a system needs to be independent of how its objects are created,
 * composed, and represented.
 * •When adding and removing objects at runtime.
 * •When specifying new objects by changing an existing objects structure.
 * •When configuring an application with classes dynamically.
 * •When keeping trying to keep the number of classes in a system to a
 * minimum.
 * •When state population is an expensive or exclusive process.
 * Benefits
 * •Speeds up instantiation of large, dynamically loaded classes.
 * •Reduced subclassing.
 * Drawbacks/consequences
 * Each subclass of Prototype must implement the Clone operation. Could be
 * difficult with existing classes with internal objects with circular references or
 * which does not support copying.
 * ***********************
 * In the class-diagram above:
 * •Prototype declares an interface for cloning itself.
 * •ConcretePrototype implements an operation for cloning itself.
 * •Client creates a new object by asking a prototype to clone itself.
 * You could use a PrototypeManager to keep track on the different types of
 * prototypes. The PrototypeManager maintains a list of clone types and their
 * keys. The client, instead of writing code that invokes the "new" operator on a
 * hard-wired class name, calls the clone() method on the prototype.
 */
public class ProtoTypeExample {
    Hashtable<String, Product> productMap =  new Hashtable<String, Product>();

    public Product getProduct(String productCode){
        Product cacheProduct = (Product)productMap.get(productCode);
        return (Product) cacheProduct.clone();

    }

    public void loadCache(){
        //for each product run expensive query and instantiate
        // product productMap.put(productKey, product);
        // for exemplification, we add only two products
        Book b1 = new Book();
        b1.setDescription("Test");
        b1.setNumberOfPages(7);
        b1.setSKU("BK007");
        productMap.put(b1.getSKU(),b1);
        DVD dvd = new DVD();
        dvd.setDuration(70);
        dvd.setDescription("dvd test");
        dvd.setSKU("DVD007");
        productMap.put(dvd.getSKU(),dvd);

    }

    public static void main(String args[]) {
        ProtoTypeExample pe = new ProtoTypeExample();
        pe.loadCache();
        Book clonedBook = (Book)pe.getProduct("BK007");
        System.out.println("SKU = " + clonedBook.getSKU());
        System.out.println("SKU = " + clonedBook.getDescription());
        System.out.println("SKU = " + clonedBook.getNumberOfPages());
        DVD clonedDvd = (DVD)pe.getProduct("DVD007");
        System.out.println("SKU = " + clonedDvd.getSKU());
        System.out.println("SKU = " + clonedDvd.getDescription());
        System.out.println("SKU = " + clonedDvd.getDuration());
    }
}
