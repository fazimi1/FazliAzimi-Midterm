package string.problems;

/**
 * Created by mrahman on 04/22/17.
 */
public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String str = "abc";
        perm(str);
    }

    public static void perm(String str) {
        char[] char_arr = str.toCharArray();
        helper(char_arr, 0);
    }

    public static void helper(char[] char_arr, int i) {
        if (i == char_arr.length - 1) {
            // print the shuffled string
            String str = "";
            for (int j = 0; j < char_arr.length; j++) {
                str = str + char_arr[j];
            }
            System.out.println(str);
        } else {
            for (int j = i; j < char_arr.length; j++) {
                char tmp = char_arr[i];
                char_arr[i] = char_arr[j];
                char_arr[j] = tmp;
                helper(char_arr, i + 1);
                char tmp1 = char_arr[i];
                char_arr[i] = char_arr[j];
                char_arr[j] = tmp1;

            }
        }
    }
}