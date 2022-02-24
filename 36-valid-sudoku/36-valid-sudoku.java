class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> s = new HashSet<>();
        for(int row = 0;row<9;row++){
            for(int col = 0;col<9;col++){
                if(board[row][col]!='.'){
                    if(!s.add("R" + row + board[row][col]) || !s.add("C" + col + board[row][col])) return false;
                    if(!s.add("B" + ((row/3)*3 + (col/3)) +board[row][col])) return false;
                }
            }
        }
        return true;
    }
}