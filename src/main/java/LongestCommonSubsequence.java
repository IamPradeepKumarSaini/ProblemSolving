/* Dynamic Programming Java implementation of LCS problem */
public class LongestCommonSubsequence {

    /* Returns length of LCS for X[0..m-1], Y[0..n-1] */
    int getlongestCommonSubSequcne( char[] X, char[] Y, int m, int n ) {
        int dp[][] = new int[m+1][n+1];
  
    /* Following steps build L[m+1][n+1] in bottom up fashion. Note 
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
        for (int i=0; i<=m; i++) {
            for (int j=0; j<=n; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (X[i-1] == Y[j-1])
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

    /* Utility function to get max of 2 integers */
    int max(int a, int b) {
        return (a > b)? a : b;
    }

    public static void main(String[] args) {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";
        char[] char_s1_arr = s1.toCharArray();
        char[] char_s2_arr = s2.toCharArray();
        int a = char_s1_arr.length;
        int b = char_s2_arr.length;
        System.out.println("LCSubsequence is" + " " + lcs.getlongestCommonSubSequcne(char_s1_arr, char_s2_arr, a, b ) );
    }
}