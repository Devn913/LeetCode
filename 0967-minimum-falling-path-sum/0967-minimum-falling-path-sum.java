// Approach: 1 Dynnamic Programming
// class Solution {
//     public int minFallingPathSum(int[][] matrix) {
//         int[][] dp = new int[matrix.length][matrix.length];
//         int ans = Integer.MAX_VALUE;
//         for(int i =0;i<matrix.length;i++){
//             dp[0][i] = matrix[0][i];
//             ans = Math.min(ans,dp[0][i]);
//         }
//         for (int i = 1; i < matrix.length; i++) {
//             for(int j = 0;j<matrix.length;j++){
//                 if(j == 0){
//                     dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j+1]);
//                     ans = dp[i][j]; 
//                 }else if(j == matrix.length -1){
//                     dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],dp[i-1][j-1]);
//                     ans = Math.min(ans,dp[i][j]);
//                 }else{
//                     dp[i][j] = matrix[i][j] + Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
//                     ans = Math.min(ans,dp[i][j]);
//                 }
//             }
//         }
//         return ans;
//     }
// }

// Approach 2: 
class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        for(int i =0;i<matrix.length;i++){
            ans = Math.min(ans,matrix[0][i]);
        }

        for (int i = 1; i < matrix.length; i++) {
            for(int j = 0;j<matrix.length;j++){
                if(j == 0){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],matrix[i-1][j+1]);
                    ans = matrix[i][j]; 
                }else if(j == matrix.length -1){
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],matrix[i-1][j-1]);
                    ans = Math.min(ans,matrix[i][j]);
                }else{
                    matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j],Math.min(matrix[i-1][j-1],matrix[i-1][j+1]));
                    ans = Math.min(ans,matrix[i][j]);
                }
            }
        }
        return ans;

    }
}