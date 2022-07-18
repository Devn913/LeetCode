class Solution {
    public boolean helper(char[][] board, String word, int row, int col){
        if(word.length()==0) return true;
        if(row<0 || col<0 || row==board.length || col ==board[0].length) return false;
        if(board[row][col]=='0') return false;
        if(word.charAt(0) == board[row][col]){
            board[row][col] = '0';
            boolean ans = helper(board,word.substring(1,word.length()),row+1,col) ||
                helper(board,word.substring(1,word.length()),row,col+1)||
                helper(board,word.substring(1,word.length()),row-1,col)||
                helper(board,word.substring(1,word.length()),row,col-1);
            if(ans) return ans;
            board[row][col] = word.charAt(0);
        }
        return false;
    }
    public boolean exist(char[][] board, String word) {
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                boolean ans = helper(board, word, i,j);
                if(ans) return ans;
            }
        }
        return false;
    }
}