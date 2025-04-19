// class Solution {
//     public int LCS(String s, int m, int n) {
//         if (m <= 0 || n > s.length())
//             return 0;
//         if (s.charAt(m - 1) == s.charAt(n - 1))
//             return 1 + LCS(s, m - 1, n + 1);
//         else
//             return Math.max(LCS(s, m - 1, n), LCS(s, m, n + 1));
//     }

//     public int longestPalindromeSubseq(String s) {
//         return LCS(s, s.length(), 1);
//     }
// }

// class Solution {
//     public int LCS(String s, int[][] memo, int m, int n) {
//         if (m <= 0 || n > s.length())
//             return 0;
//         if (memo[m - 1][n - 1] != -1)
//             return memo[m - 1][n - 1];
//         if (s.charAt(m - 1) == s.charAt(n - 1))
//             memo[m - 1][n - 1] = 1 + LCS(s, memo, m - 1, n + 1);
//         else
//             memo[m - 1][n - 1] = Math.max(LCS(s, memo, m - 1, n), LCS(s, memo, m, n + 1));
//         return memo[m - 1][n - 1];
//     }

//     public int longestPalindromeSubseq(String s) {
//         int[][] memo = new int[s.length() + 1][s.length() + 1];
//         for (int i = 0; i <= s.length(); i++) {
//             for (int j = 0; j <= s.length(); j++) {
//                 memo[i][j] = -1;
//             }
//         }
//         return LCS(s, memo, s.length(), 1);
//     }
// }

class Solution {


    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length() + 1][s.length() + 1];

        for (int m = 1; m <= s.length(); m++) {
            for (int n = 1; n <= s.length(); n++) {
                if (s.charAt(m - 1) == s.charAt(s.length() - n))
                    dp[m][n] = 1 + dp[m - 1][n - 1];
                else
                    dp[m][n] = Math.max(dp[m - 1][n], dp[m][n - 1]);
            }
        }

        return dp[s.length()][s.length()];
    }
}
