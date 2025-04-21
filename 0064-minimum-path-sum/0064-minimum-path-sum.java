class Solution {
    // Approach 1: Recursion - TLE
    // TC        : O(2^(mxn))
    // SC        : O(1) 
    // public int helper(int[][] grid, int row, int col){
    //     if(row == grid.length -1 && col ==  grid[0].length -1) return grid[row][col];
    //     if(row>=grid.length || col>= grid[0].length) return Integer.MAX_VALUE;

    //     int choice1 = helper(grid,row+1,col);
    //     int choice2 = helper(grid, row, col+1);

    //     return Math.min(choice1,choice2) + grid[row][col];
    // }
    // public int minPathSum(int[][] grid) {
    //     return helper(grid,0,0);
    // }

    // Approach 2: Memoization

    public int helper(int[][] grid, int[][] memo, int row, int col){
        if(row == grid.length -1 && col ==  grid[0].length -1) return grid[row][col];
        if(row>=grid.length || col>= grid[0].length) return Integer.MAX_VALUE;
        if(memo[row][col]!=-1) return memo[row][col];

        int choice1 = helper(grid,memo, row+1, col);
        int choice2 = helper(grid,memo, row,   col+1);

        memo[row][col] = Math.min(choice1,choice2) + grid[row][col];
        return memo[row][col];
    }

    public int minPathSum(int[][] grid) {
        int[][] memo = new int[grid.length][grid[0].length];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                memo[i][j] = -1;
            }
        }
        return helper(grid,memo,0,0);
    }
}