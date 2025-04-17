// Method: 1 Recursion (TLE)
// class Solution {
//     public int helper(int[][] obstacleGrid, int row, int col){
//         if(row >= obstacleGrid.length || col >= obstacleGrid[0].length) return 0;
//         if(row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1) return 1;
//         if(obstacleGrid[row][col] == 1) return 0;
//         return helper(obstacleGrid,row+1,col) + helper(obstacleGrid,row,col+1);
//     }
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         return helper(obstacleGrid,0,0);
//     }
// }

class Solution {
    public int helper(int[][] obstacleGrid, int row, int col, int[][] dp){
        if(row >= obstacleGrid.length || col >= obstacleGrid[0].length) return 0;
        if(row == obstacleGrid.length - 1 && col == obstacleGrid[0].length - 1) return 1;
        if(obstacleGrid[row][col] == 1) return 0;
        if(dp[row][col]!=-1) return dp[row][col];
        dp[row][col] = helper(obstacleGrid,row+1,col,dp) + helper(obstacleGrid,row,col+1,dp);
        return dp[row][col];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[obstacleGrid.length -1][obstacleGrid[0].length -1 ] == 1) return 0;

        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int  i = 0;i<dp.length;i++){
            for(int j = 0;j<dp[0].length;j++){
                dp[i][j]= -1;
            }
        }
        return helper(obstacleGrid,0,0,dp);
    }
}



