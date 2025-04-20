class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        for (int i = 1; i < matrix.length; i++) {
            for(int j = 0;j<matrix.length;j++){
                int min = Integer.MAX_VALUE;
                for(int k =0;k<matrix.length;k++){
                    if(j == k) continue;
                    min = Math.min(min,matrix[i-1][k]);
                }
                // if(j == 0){
                //     matrix[i][j] = matrix[i][j] + matrix[i-1][j+1];
                // }else if(j == matrix.length -1){
                //     matrix[i][j] = matrix[i][j] + matrix[i-1][j-1];
                // }else{
                //     matrix[i][j] = matrix[i][j] + Math.min(matrix[i-1][j-1],matrix[i-1][j+1]);
                // }
                matrix[i][j] = matrix[i][j] + min;
            }
        }

        for(int i = 0;i<matrix.length;i++){
            ans = Math.min(ans,matrix[matrix.length-1][i]);
        }
        return ans;
    }
}