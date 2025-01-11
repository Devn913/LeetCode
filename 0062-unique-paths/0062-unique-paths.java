class Solution {
    public int uniquePaths(int m, int n) {
        if(m==1 && n == 1) return 1;
        int[][] dp = new int[m][n];
        dp[0][0] = 0;
        for(int row = 1;row<m;row++){
            dp[row][0] = 1;
        }
        for(int col = 1;col<n;col++){
            dp[0][col] = 1;
        }
        for(int row = 1;row<m;row++){
            for(int col = 1;col<n;col++){
                dp[row][col] = dp[row-1][col]+dp[row][col-1];
            }
        }
        return dp[m-1][n-1];
    }
}