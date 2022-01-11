class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0;i<row;i++){
            if(matrix[i][col-1]>=target && matrix[i][0]<=target){
                row = 0;
                col = matrix[0].length -1;
                while(row<=col){
                    int mid = (row+col)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]>target) col = mid-1;
                    else row = mid+1;
                }
                return false;
            }
        }
        return false;
    }
}