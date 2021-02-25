package palindrome;

/**
 * Consider the case "ababa". If we already knew that "bab" is a palindrome, it is obvious that "ababa" must be a palindrome since the two left and right end letters are the same.
 *
 * We define P(i,j)P(i,j) as following:
 *
 * P(i,j) = \begin{cases} \text{true,} &\quad\text{if the substring } S_i \dots S_j \text{ is a palindrome}\\ \text{false,} &\quad\text{otherwise.} \end{cases}P(i,j)={
 * true,
 * false,
 * ​
 *
 * if the substring S
 * i
 * ​
 *  …S
 * j
 * ​
 *   is a palindrome
 * otherwise.
 * ​
 *
 *
 * Therefore,
 *
 * P(i, j) = ( P(i+1, j-1) \text{ and } S_i == S_j )P(i,j)=(P(i+1,j−1) and S
 * i
 * ​
 *  ==S
 * j
 * ​
 *  )
 *
 * The base cases are:
 *
 * P(i, i) = trueP(i,i)=true
 *
 * P(i, i+1) = ( S_i == S_{i+1} )P(i,i+1)=(S
 * i
 * ​
 *  ==S
 * i+1
 * ​
 *  )
 *
 * This yields a straight forward DP solution, which we first initialize the one and two letters palindromes, and work our way up finding all three letters palindromes, and so on...
 *
 * Complexity Analysis
 *
 * Time complexity : O(n^2)O(n
 * 2
 *  ). This gives us a runtime complexity of O(n^2)O(n
 * 2
 *  ).
 *
 * Space complexity : O(n^2)O(n
 * 2
 *  ). It uses O(n^2)O(n
 * 2
 *  ) space to store the table.
 */
public class LongestPalindrome {
    public static void main(String args[]) {

        //String s = "hgjknkljhjljabcdadcbkljlkj";
        //String s = "dadabacaaaaa";
        String s = "ajhjjhbfkjhkkkkjhfjajflkjl";
        System.out.println(logestPalindrome(s));

    }

    public static String logestPalindrome(String s) {
        if (s == null || s.equalsIgnoreCase("")) {
            return s;
        }
        int len = s.length();
        String ans = "";
        int max = 0;
        boolean [] [] dp = new boolean[len][len];
        for (int j=0; j< len;j++ ) {
            for (int i=0; i <= j; i++) {
                boolean judge = s.charAt(i) == s.charAt(j);
                dp [i][j] = j - i > 2 ? dp [i+1] [j-1] && judge : judge;
                if (dp[i][j] && j-i + 1 > max) {
                    max = j-1+1;
                    ans = s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
}
