class Solution {
    
    public void setZeroes(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>(matrix.length);
        HashSet<Integer> cols = new HashSet<>(matrix[0].length);
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row: rows){
            for(int i =0;i<matrix[0].length;i++){
                matrix[row][i] = 0;
            }
        }
        for(int col: cols){
            for(int i = 0;i<matrix.length;i++){
                matrix[i][col] = 0;
            }
        }
        
    }
}