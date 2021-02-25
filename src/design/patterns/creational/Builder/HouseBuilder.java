package design.patterns.creational.Builder;

/**
 * Definition
 * The Builder pattern can be used to ease the construction of a complex object
 * from simple objects. The Builder pattern also separates the construction of a
 * complex object from its representation so that the same construction process
 * can be used to create another composition of objects.
 * Related patterns include Abstract Factory and Composite.
 * Where to use
 * •When the algorithm for creating a complex object should be independent of
 * the parts that make up the object and how they are assembled.
 * •When the construction process must allow different representations for the
 * object that is constructed.
 * •When you want to insulate clients from the knowledge of the actual
 * creation process and/or resulting product.
 * Benefits
 * •The built object is shielded from the details of its construction.
 * •Code for construction is isolated from code for representation and both are
 * easy to replace without affecting the other.
 * •Gives you control over the construction process.
 * •Gives you the possibility to reuse and/or change the process and/or product
 * independently.
 * Drawbacks/consequences
 * Need flexibility in creating various complex objects. Need to create complex,
 * aggregate objects
 */
public abstract class HouseBuilder {
    protected House house;
    protected Floor floor;
    protected Walls walls;
    protected Roof roof;

    public abstract House createHouse();
    public abstract Floor createFloor();
    public abstract Walls createWalls();
    public abstract Roof createRoof();
}
/**
 * Structure
 * In the class diagram above:
 * •The Builder specifies an abstract interface for creating parts of a Product.
 * •The ConcreteBuilder constructs and assembles parts of the product by
 * implementing the Builder interface.
 * •The Director constructs an object using the Builder interface.
 * •The Product represents the object under construction.
 * Small example
 * For instance to build a house, we will take several steps:
 * 1. Build floor
 * 2. Build walls
 * 3. Build roof
 * Let's use an abstract class HouseBuilder to define these three steps. Any
 * subclass of HouseBuilder will follow these three steps to build house (that is
 * to say to implement these three methods in the subclass). Then we use a
 * HouseDirector class to force the order of these three steps (that is to say that
 * we have to build walls after finished building floor and before building roof).
 * The HouseClient orders the building of two houses, one wood house and one
 * brick house. Even though the houses are of different types (wood and brick)
 * they are built the same way, The construction process allows different
 * representations for the object that is constructed.
 * ******************************* Example ***********************
 * Usage example
 * Some examples of using the Builder pattern in knowledge engineering include
 * different generators. Parsers in various compilers are also designed using the
 * Builder pattern.
 **/
