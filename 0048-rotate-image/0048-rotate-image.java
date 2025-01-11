class Solution {
    public void swap(int[][] matrix, int row, int col){
        int temp = matrix[row][col];
        matrix[row][col] = matrix[col][row];
        matrix[col][row] = temp;
    }
    public void rotateRow(int[][] matrix, int row){
        int col = 0;
        int lastCol = matrix[0].length-1;
        while(col<lastCol){
            int temp = matrix[row][col];
            matrix[row][col] = matrix[row][lastCol];
            matrix[row][lastCol] = temp;
            col++;
            lastCol--;
        }
    }
    public void rotate(int[][] matrix) {
        int row = 0;
        int col = 0;
        while(row<matrix.length && col < matrix[0].length){
            while(col<matrix[0].length){
                swap(matrix,row,col++);
            }
            row++;
            col = row;
        }

        for(row = 0;row<matrix.length;row++){
            rotateRow(matrix,row);
        }

    }
}