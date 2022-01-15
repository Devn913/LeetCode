class Solution {
    public boolean helper(int[][] matrix, int current, int target){
        if(current>=matrix.length|| current>=matrix[0].length) return false;
        if(matrix[current][current]>target) return false;
        int low = current;
        int high = matrix[current].length -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[current][mid]>target){
                high = mid -1;
            }else if(matrix[current][mid]<target){
                low = mid+1;
            }else{
                return true;
            }
        }
        low = current;
        high = matrix.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid][current]>target){
                high = mid -1;
            }else if(matrix[mid][current]<target){
                low = mid+1;
            }else return true;
        }
        return helper(matrix,current+1,target);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        // if(matr)
        return helper(matrix,0,target);
    }
}