package revision.design.patterns.singleton;

public class TestSingleTon {

    public static void main(String args[]) {
        TestClass obj1 = TestClass.getTestClass();
        TestClass obj2 = TestClass.getTestClass();

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}
