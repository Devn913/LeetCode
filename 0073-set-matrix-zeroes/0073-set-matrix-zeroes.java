class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean first_row_has_zero = false;
        boolean first_col_has_zero = false;

        // check if first row has any zero
        for(int c = 0;c<cols;c++){
            if(matrix[0][c] == 0){
                first_row_has_zero = true;
                break;
            }
        }

        // check if first col has any zero
        for(int r = 0;r<rows;r++){
            if(matrix[r][0] == 0){
                first_col_has_zero = true;
                break;
            }
        }
        // checking for zero elsewhere and keeping track of it in the first row and first column
        for(int r = 1;r<rows;r++){
            for(int c = 1;c<cols;c++){
                if(matrix[r][c] == 0){
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;
                }
            }
        }

        // checking and setting respcted row to zero
        for(int c = 1;c<cols; c++){
            if(matrix[0][c] == 0){
                for(int r = 0;r<rows;r++){
                    matrix[r][c] = 0;
                }
            }
        }

        // checking and setting respcted cols to zero
        for(int r = 1;r<rows; r++){
            if(matrix[r][0] == 0){
                for(int c = 0;c<cols;c++){
                    matrix[r][c] = 0;
                }
            }
        }

        if(first_row_has_zero == true){
            for(int c = 0;c<cols;c++){
                matrix[0][c] = 0;
            }
        }

        if(first_col_has_zero == true){
            for(int r = 0;r<rows;r++){
                matrix[r][0] = 0;
            }
        }


        
        
    }
}