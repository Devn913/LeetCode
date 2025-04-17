// Recursion: TLE
// class Solution {
//     public int helper(int m, int n, int i, int j){
//         if(i ==  m-1 && j == n-1) return 1;
//         if(i>= m || j>=n) return 0;
//         return helper(m,n,i+1,j) + helper(m,n,i,j+1);    
//     }
//     public int uniquePaths(int m, int n) {
//         return helper(m,n,0,0);
//     }
// }

// Method: 2 Memoization
// class Solution {
//     public int helper(int m, int n, int i, int j, int[][] dp){
//         if(i>= m || j>=n) return 0;
//         if(dp[i][j]!=-1) return dp[i][j];
//         if(i ==  m-1 && j == n-1) return 1;
//         dp[i][j] =  helper(m,n,i+1,j,dp) + helper(m,n,i,j+1,dp);
//         return dp[i][j];
//     }
//     public int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for(int i = 0;i<m;i++){
//             for(int j = 0;j<n;j++){
//                 dp[i][j] = -1;
//             }
//         }
//         return helper(m,n,0,0,dp);
//     }
// }

// Method: 3 Dynammic Programming
// Time Complexity  : O(m*n)
// Space Complexity : O(m*n) 
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i = 0;i<n;i++){
            dp[m-1][i] = 1;
        }
        for(int i = 0;i<m;i++){
            dp[i][n-1] = 1;
        }
        for(int i = m-2;i>=0;i--){
            for(int j = n-2;j>=0;j--){
                dp[i][j] = dp[i+1][j] + dp[i][j+1];
            }
        }
        return dp[0][0];
    }
}


