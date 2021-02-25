package design.patterns.structural.adapter;

/**
 * Definition The Adapter pattern is used to translate the interface of one class into another interface. This means
 * that we can make classes work together that couldn't otherwise because of incompatible interfaces. A class adapter
 * uses multiple inheritance (by extending one class and/or implementing one or more classes) to adapt one interface to
 * another. An object adapter relies on object aggregation. Where to use •When you want to use an existing class, and
 * its interface does not match the one you need. •When you want to create a reusable class that cooperates with
 * unrelated or unforeseen classes, that is, classes that don't necessarily have compatible interfaces. •When you want
 * to increase transparency of classes. •When you want to make a pluggable kit. Benefits •Highly class reusable.
 * •Introduces only one object Drawbacks/consequences When using Java, Target must be an interface.
 * <p>
 * ************* In the class-diagram above: •A Client class expects a certain interface (called the Target interface)
 * •An available interface doesn't match the Target interface •An Adapter class bridges the gap between the Target
 * interface and the available interface •The available interface is called the Adaptee ********************************
 * Small example Imagine you need to develop a simple file manager to handle text documents. There is an existing
 * resource that already handles this, but by some reason you are forced to a specific interface for your file manager.
 * By using a class adapter we can use the forced interface and still reuse the existing functionality. In the class
 * diagram below the interface FileManager is the target (desired interface). FileManagerUtil is the existing utility
 * class that we would like to adapt to FileManager interface. We do the actual adaptation in the class FileManagerImpl,
 * this class uses the desired interface and the existing functionality through inheritance, i.e. a class adapter.
 * <p>
 * <p>
 * **** Usage example The Java API uses the Adapter pattern, WindowAdapter, ComponentAdapter, ContainerAdapter,
 * FocusAdapter, KeyAdapter, MouseAdapter, MouseMotionAdapter.
 */
public class Defination {
}
