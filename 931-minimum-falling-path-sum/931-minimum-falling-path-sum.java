class Solution {
    private int minPath(int[][] matrix, int row, int col, int[][] dp){
        if(row == matrix.length-1) return matrix[row][col];
        if(dp[row][col] != Integer.MAX_VALUE) return dp[row][col];
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        if(row+1<matrix.length) down = minPath(matrix,row+1,col,dp);
        if(row+1<matrix.length && col-1>-1) left = minPath(matrix,row+1,col-1,dp);
        if(row+1<matrix.length && col+1<matrix[0].length) right = minPath(matrix,row+1,col+1,dp);
        dp[row][col] = matrix[row][col] + Math.min(left,Math.min(down,right));
        return dp[row][col];
    }
    public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<matrix[0].length;i++){
            min = Math.min(min,minPath(matrix,0,i,dp));
        }
        return min;
        
    }
}