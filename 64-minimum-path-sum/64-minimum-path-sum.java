class Solution {
    public int minPathSum(int[][] grid, int currentRow,int currentCol, int rows, int cols, int[][] dp){
        if(currentRow == rows && currentCol == cols) return grid[rows][cols];
        int down = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(currentRow!=rows){ 
            if(dp[currentRow+1][currentCol]!=-1){
                down = dp[currentRow+1][currentCol];
            }else down = minPathSum(grid,currentRow+1,currentCol,rows,cols,dp);
        }
        if(currentCol!= cols){
            if(dp[currentRow][currentCol+1]!=-1) right = dp[currentRow][currentCol];
            else right = minPathSum(grid,currentRow,currentCol+1,rows,cols,dp);
        }
        dp[currentRow][currentCol] = Math.min(down,right) + grid[currentRow][currentCol];
        return dp[currentRow][currentCol];
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        return minPathSum(grid,0,0,m- 1,n -1,dp);
        
    }
}