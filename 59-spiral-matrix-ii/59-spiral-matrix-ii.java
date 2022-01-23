class Solution {    
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int rowStart = 0;
        int rowEnd = n -1;
        int start = 1;
        while(rowStart<=rowEnd){
            if(rowStart == rowEnd){
                matrix[rowStart][rowEnd] = start;
                break;
            }
            for(int i = rowStart;i<=rowEnd;i++){
                matrix[rowStart][i] = start;
                start++;
            }
            for(int i = rowStart+1;i<rowEnd;i++){
                matrix[i][rowEnd]=start;
                start++;
            }
            for(int i = rowEnd;i>=rowStart;i--){
                matrix[rowEnd][i] = start;
                start++;
            }
            for(int i = rowEnd - 1;i>rowStart;i--){
                matrix[i][rowStart] = start;
                start++;
            }
            rowStart++;
            rowEnd--;    
        }
        return matrix;
    }
}