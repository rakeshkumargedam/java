package own.thoughts;

public class Factorial {

    public static void main(String args[]) {
        int input = 10;
        int outPut=1;
        for (int i=2; i <= input; i++) {
            outPut = outPut * i;
        }

        System.out.println(outPut);
    }
}
