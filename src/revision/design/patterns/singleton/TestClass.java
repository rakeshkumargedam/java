package revision.design.patterns.singleton;

public class TestClass {
    private static TestClass testClass;
    private TestClass(){

    }

    public static TestClass getTestClass(){
        if (testClass == null) {
            testClass = new TestClass();
        }
        return testClass;
    }

}
