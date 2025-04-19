class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        for(int i = 0;i<grid[0].length;i++){
            dp[grid.length][i] = 500000;
        }
        for(int i = 0;i<grid.length-1;i++){
            dp[i][grid[0].length] = 500000;
        }

        for(int i = grid.length-1;i!=-1;i--){
            for(int j = grid[0].length-1;j!=-1;j--){
                dp[i][j] = grid[i][j] + Math.min(dp[i+1][j],dp[i][j+1]);
            }
        }


        return dp[0][0];
    }
}