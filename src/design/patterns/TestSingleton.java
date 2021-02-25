package design.patterns;

public class TestSingleton {

    public static void main(String args[]) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 = Singleton.getSingleton();
        System.out.println(singleton.hashCode());
        System.out.println(singleton1.hashCode());
        TestSingleton testSingleton = new TestSingleton();
        TestSingleton testSingleton1 = new TestSingleton();

        System.out.println(testSingleton.hashCode());
        System.out.println(testSingleton1.hashCode());
    }

}
