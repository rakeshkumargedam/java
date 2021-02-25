package reverse.integer;

public class ReverseInteger {
    public static void main(String args[]) {
        String inputSr = "-00123";
        /**
         * Only for String
         */
        //
        StringBuffer bf = new StringBuffer(inputSr);
        char [] chars = new char[inputSr.length()];
        System.out.println(bf.reverse());
        for (int j= 0; j< inputSr.length();  j++){
            if ((inputSr.charAt(inputSr.length() - (j+1))) == '-'){

            }
            chars[j] = inputSr.charAt(inputSr.length() - (j+1));
        }

        for (int k = 0; k< inputSr.length();k++){

        }
        System.out.println(new String(chars));
        //











        int input = Integer.parseInt(inputSr);
        long reverse = 0;
        while (input != 0) {
            reverse = (reverse*10) + (input%10);
            input = input/10;
            if (reverse > Integer.MAX_VALUE) {
                reverse = 0;
            }
            if (reverse < Integer.MIN_VALUE) {
                reverse = 0;
            }
        }
/*        for (int i =0; i<=input; i++){
            reverse = (reverse*10) + (input%10);
            input = input/10;
            if (reverse > Integer.MAX_VALUE) {
                reverse = 0;
            }
            if (reverse < Integer.MIN_VALUE) {
                reverse = 0;
            }
        }*/



        //if (String.valueOf(reverse).length() < inputSr.length()) {
        //    String numberAsString = String.format("%0" + inputSr.length() + "d", reverse);
         //   System.out.println(numberAsString);
        //} else {
            System.out.println(reverse);
        //}

    }
}
