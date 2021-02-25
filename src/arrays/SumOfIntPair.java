package arrays;

import java.util.HashMap;
import java.util.Hashtable;

public class SumOfIntPair {

    public static void main(String args[]) {



/*
            int [] inputArray = {2,3,5,7,9,-5,4,0,3,1};
            int sum = 4;
    for (int i =0; i<=inputArray.length; i++){
            if ((i+1) < inputArray.length) {
                if (inputArray[i] + inputArray[i + 1] == sum) {
                    System.out.println("Given Pair " + inputArray[i] + "," + inputArray[i + 1] + " sum is equals to given input " + sum);
                }
            }
        }*/

/*
            int [] inputArray = {2,3,5,7,9,-5,4,0,3,1};
            int sum = 4;
    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for (int i =0 ; i<inputArray.length; i++){
                hm.put(i,inputArray[i]);
        }
        for (int j =0; j<=hm.entrySet().size();j++) {
            if ((hm.get(j + 1)) != null) {
                if ((hm.get(j) + hm.get(j + 1)) == sum) {
                    System.out.println("Given Pair " + hm.get(j) + "," + hm.get(j + 1) + " sum is equals to given input " + sum);
                }
            }
        }*/
        int [] inputArray = {2,3,5,7,9,-5,4,0,3,1};
        int sum = 4;
        int complement=0;
        Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
        for (int i=0;i<inputArray.length; i++){
            ht.put(i,inputArray[i]);
        }

        for (int j =0; j< inputArray.length; j++){
            complement = sum - inputArray[j];
                if (ht.containsKey(complement) && ht.get(complement) != j) {
                    System.out.println(complement + "," + ht.get(j));
                }
        }

    }
}
