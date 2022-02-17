class Solution {
    private int uniquePath(int m,int n, int row, int col, int[][] dp,int[][] grid){
        if(grid[row][col] == 1) return 0;
        if(row == m  && col == n ) return 1;
        int down = 0;
        int right = 0;
        if(row!=m){
            if(dp[row+1][col]!=-1){
                down = dp[row+1][col];
            }else{
                down = uniquePath(m,n,row+1,col,dp,grid);
            }
        }
        if(col!=n){
            if(dp[row][col+1]!=-1){
                right = dp[row][col+1];
            }else{
                right = uniquePath(m,n,row,col+1,dp,grid);
            }
        }
        dp[row][col] = down + right;
        return dp[row][col];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        int[][] dp = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++) dp[i][j] = -1;
        }
        return uniquePath(row-1,col-1,0,0,dp,obstacleGrid);
    }
}