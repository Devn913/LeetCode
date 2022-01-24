class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowStart = 0;
        int rowEnd = matrix[0].length -1;
        int colStart = 0;
        int colEnd = matrix.length -1;
        List<Integer> list = new ArrayList<>(matrix.length*matrix[0].length);
        while(rowStart<rowEnd && colStart<colEnd){
            for(int i = rowStart;i<=rowEnd;i++) list.add(matrix[colStart][i]);
            for(int i = colStart+1;i<colEnd;i++) list.add(matrix[i][rowEnd]);
            for(int i = rowEnd;i>=rowStart;i--) list.add(matrix[colEnd][i]);
            for(int i = colEnd -1;i>colStart;i--) list.add(matrix[i][colStart]);
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
        if(colStart == colEnd && rowStart == rowEnd){
            list.add(matrix[rowStart][rowEnd]);
        }else if(rowStart == rowEnd){
            for(int i = colStart;i<=colEnd;i++) list.add(matrix[i][rowStart]);        
        }else if(colStart == colEnd){
            for(int i = rowStart;i<=rowEnd;i++) list.add(matrix[colStart][i]);         
        } 
        return list;
    }
}