package design.patterns.structural.bridge;

/**
 * Definition Decouple an abstraction or interface from its implementation so that the two can vary independently.
 * Bridge makes a clear-cut between abstraction and implementation. Where to use •When you want to separate the abstract
 * structure and its concrete implementation. •When you want to share an implementation among multiple objects, •When
 * you want to reuse existing resources in an 'easy to extend' fashion. •When you want to hide implementation details
 * from clients. Changes in implementation should have no impact on clients. Benefits Implementation can be selected or
 * switched at run-time. The abstraction and implementation can be independently extended or composed.
 * Drawbacks/consequences Double indirection - In the example, methods are implemented by subclasses of DrawingAPI
 * class. Shape class must delegate the message to a DrawingAPI subclass which implements the appropriate method. This
 * will have a slight impact on performance.
 * <p>
 * ************************* In the class-diagram above: •Abstraction defines the abstract interface and maintains the
 * Implementor reference. •Refined Abstraction extends the interface defined by Abstraction. •Implementor defines the
 * interface for implementation classes. •ConcreteImplementor implements the Implementor interface.
 */
public class Defination {
}
