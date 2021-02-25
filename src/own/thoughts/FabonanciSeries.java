package own.thoughts;

public class FabonanciSeries {
    public static void main(String args[]) {
        int start = 0;
        int prev = 1;
        int curr = 0;
        int input = 10;
        System.out.println(start);
        System.out.println(prev);
        //System.out.println(curr);

        for (int i =2; i <= input; i++) {
            System.out.println(start + prev);
            curr = prev + start;
            start = prev;
            prev = curr;
        }
    }
}
