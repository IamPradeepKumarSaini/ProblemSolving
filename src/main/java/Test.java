public class Test {

    public static void main (String args[]) {

        String s1 = "abcdxyz";
        String s2 = "ertabcd";

        char[] char_s1_arr = s1.toCharArray();
        char[] char_s2_arr = s2.toCharArray();
        int a = char_s1_arr.length;
        int b = char_s2_arr.length;

        Test lcs = new Test();
        System.out.println("LCSubString is" + " " + lcs.getlongestCommonSubString( char_s1_arr, char_s2_arr, a, b ) );
    }

    static int getlongestCommonSubString(char[] char_s1_arr, char[] char_s2_arr, int a, int b) {
        int dp[][] = new int[a + 1][b + 1];
        int result = 0;  // To store length of the longest common substring
        return result;
    }
}
