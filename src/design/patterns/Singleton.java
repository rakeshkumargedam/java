package design.patterns;

/**
 * in singleton pattern  Class to have only one object created
 *
 * Need of Singleton pattern : Objects used for logging , device drivers for printers and registry
 * settings need to have only one of a kind. if there are multiple objects we may encounter problems like
 * incorrect program behaviour, inconsistent result etc...
 */
public class Singleton {

    /** Create instance and generate getter and setters**/
    private static Singleton singleton;
    private Singleton(){
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }


}
