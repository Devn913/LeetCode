class Solution {
    public void setRowZero(int[][] matrix, int row){
        for(int i = 0;i<matrix[0].length;i++){
            matrix[row][i] = 0;
        }
    }
    public void setColZero(int[][] matrix, int col){
        for(int i = 0;i<matrix.length;i++){
            matrix[i][col] = 0;
        }
    }
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet = new HashSet<>();
        Set<Integer> colSet = new HashSet<>();
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j] == 0){
                    if(!(rowSet.contains(i))){

                        rowSet.add(i);
                    }
                    if(!(colSet.contains(j))){

                        colSet.add(j);
                    } 
                }

            }
        }
        for(int ele: rowSet){
            setRowZero(matrix,ele);
        }
        for(int ele: colSet){
            setColZero(matrix,ele);
        }
    
    }
}