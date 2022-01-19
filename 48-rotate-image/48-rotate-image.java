class Solution {
    
    private void swap(int[][] matrix, int a, int b, int i, int j){
        int temp = matrix[a][b];
        matrix[a][b] = matrix[i][j];
        matrix[i][j] = temp;
    }
    
    public void rotateHelper(int[][] matrix, int start, int end){
        if(start>end) return;
        swap(matrix,start,start,start,end);
        swap(matrix,end,start,end,end);
        swap(matrix,start,start,end,end);
        for(int i = start+1;i<end;i++){
            swap(matrix,start,i,i,end);
            swap(matrix,i,start,end,i);
            // swap(matrix,)
        }
        int counter = 1;
        for(int i = start+1;i<end;i++){
            swap(matrix,start,i,end,end - counter);
            counter++;
        }
        start++;
        end--;
        rotateHelper(matrix,start,end);
    }
    
    public void rotate(int[][] matrix) {
        rotateHelper(matrix,0,matrix.length -1);
    }
}