package design.patterns.basic.Concept;
/** whatever is on Right side of assignment it takes the precidence and left side is always properties **/
public class BasicConcept {
    public static void main(String args[]){
        TestClass objA = new TestClass() {
            @Override
            public void print() {
                System.out.println("overridden");
            }
        };
        objA.print();;
        TestClassB objB = new TestClassB();
        objB.printb();
        objB.print();

        int x = 7;
        TestClass obj = new TestClassB();
        obj.print();

    }
}
