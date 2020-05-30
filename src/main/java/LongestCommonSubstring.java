public class LongestCommonSubstring {
    /*
       Returns length of longest common substring
       of X[0..m-1] and Y[0..n-1]
    */


    int getlongestCommonSubString(char X[], char Y[], int m, int n) {
        // Create a table to store lengths of longest common suffixes of
        // substrings. Note that LCSuff[i][j] contains length of longest
        // common suffix of X[0..i-1] and Y[0..j-1]. The first row and
        // first column entries have no logical meaning, they are used only
        // for simplicity of program
        int dp[][] = new int[m + 1][n + 1];
        int result = 0;  // To store length of the longest common substring

        // Following steps build LCSuff[m+1][n+1] in bottom up fashion
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (X[i - 1] == Y[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    result = Integer.max(result, dp[i][j]);
                } else
                    dp[i][j] = 0;
            }
        }
        return result;
    }

    // Driver Program to test above function
    public static void main(String[] args) {

        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String s1 = "abcdxyz";
        String s2 = "ertabcd";

        char[] char_s1_arr = s1.toCharArray();
        char[] char_s2_arr = s2.toCharArray();
        int a = char_s1_arr.length;
        int b = char_s2_arr.length;
        System.out.println("LCSubString is" + " " + lcs.getlongestCommonSubString(char_s1_arr, char_s2_arr, a, b ) );
    }
}
