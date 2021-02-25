package own.thoughts;

public class MyMain {

    public static void main(String args[]) {
        String name = "aa";
        String out="";

        char[] nameArr = new char[name.length()];
        char[] outArr =  new char[name.length()];

        for (int i = name.length() -1; i >=0; i--){
            outArr[name.length() - (i + 1)] = name.charAt(i);
        }

        if (name.equalsIgnoreCase(new String(outArr))) {
            System.out.println(name + " is palindrome String");
        }
    }
}
