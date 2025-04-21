class Solution {
    // Method 1: Recusion TLE
    // public int helper(int[][] mat, int row, int col){
    //     if(col>=mat.length || col< 0) return Integer.MAX_VALUE;
    //     if(row == mat.length) return 0;

    //     int choice1 = helper(mat,row+1,col);
    //     int choice2 = helper(mat,row+1,col-1);
    //     int choice3 = helper(mat,row+1,col+1);

    //     return mat[row][col] + Math.min(choice1,Math.min(choice2, choice3));
    // }
    // public int minFallingPathSum(int[][] matrix) {
    //     int ans = Integer.MAX_VALUE;
    //     for(int i = 0;i<matrix.length;i++){
    //         ans = Math.min(ans,helper(matrix,0,i));
    //     }
    //     return ans;
    // }

    // Method 2: Memoization (TLE)
    // public int helper(int[][] mat,int[][] memo, int row, int col){
    //     if(col>=mat.length || col< 0) return Integer.MAX_VALUE;
    //     if(row == mat.length) return 0;
    //     if(memo[row][col]!=-1) return memo[row][col];

    //     int choice1 = helper(mat,memo,row+1,col);
    //     int choice2 = helper(mat,memo,row+1,col-1);
    //     int choice3 = helper(mat,memo,row+1,col+1);

    //     memo[row][col] =  mat[row][col] + Math.min(choice1,Math.min(choice2, choice3));
    //     return memo[row][col];
    // }
    // public int minFallingPathSum(int[][] matrix) {
    //     int ans = Integer.MAX_VALUE;
    //     int[][] memo = new int[matrix.length][matrix.length];
    //     for(int i = 0;i<memo.length;i++){
    //         for(int j = 0;j<memo.length;j++){
    //             memo[i][j] = -1;
    //         }
    //     }
    //     for(int i = 0;i<matrix.length;i++){
    //         ans = Math.min(ans,helper(matrix,memo,0,i));
    //     }
    //     return ans;
    // }

    // Method 3: DP

    // public int minFallingPathSum(int[][] matrix) {
    //     int[][] dp = new int[matrix.length+1][matrix.length+1];
    //     for(int i = matrix.length - 1;i!=-1;i--){
    //         for(int j = matrix.length - 1;j!=-1;j--){
    //             if(j == 0){
    //                 dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j],dp[i+1][j+1]) ;
    //             }else if(j == matrix.length -1){
    //                 dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j],dp[i+1][j-1]);
    //             }
    //             else dp[i][j] = matrix[i][j] + Math.min(dp[i+1][j],Math.min(dp[i+1][j-1],dp[i+1][j+1]));
    //         }
    //     }
    //     int ans = Integer.MAX_VALUE;
    //     for(int i = 0;i<matrix.length;i++){
    //         ans = Math.min(ans,dp[0][i]);
    //     }

    //     return ans;
    // }


    // No extra memory
    public int minFallingPathSum(int[][] matrix) {
        // int[][] dp = new int[matrix.length+1][matrix.length+1];
        for(int i = matrix.length - 2;i!=-1;i--){
            for(int j = matrix.length - 1;j!=-1;j--){
                if(j == 0){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i+1][j],matrix[i+1][j+1]) ;
                }else if(j == matrix.length -1){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i+1][j],matrix[i+1][j-1]);
                }
                else matrix[i][j] = matrix[i][j] + Math.min(matrix[i+1][j],Math.min(matrix[i+1][j-1],matrix[i+1][j+1]));
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<matrix.length;i++){
            ans = Math.min(ans,matrix[0][i]);
        }

        return ans;
    }
}