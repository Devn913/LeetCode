class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0;i<row;i++){
            if(matrix[i][col-1]>=target && matrix[i][0]<=target){
                int low = 0;
                int high = matrix[0].length -1;
                while(low<=high){
                    int mid = (low+high)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(matrix[i][mid]>target) high = mid-1;
                    else low = mid+1;
                }
                return false;
            }
        }
        return false;
    }
}