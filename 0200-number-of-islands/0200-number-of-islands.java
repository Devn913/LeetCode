class Solution {
    public void helper(char[][] grid, int rows, int cols, int row, int col, boolean[][] visited){
        if(row<0 || col<0 || row>=rows || col>= cols) return;
        if(visited[row][col]) return;
        if(grid[row][col] == '0') return;
        visited[row][col] = true;
        helper(grid,rows,cols,row+1,col,visited);
        helper(grid,rows,cols,row,col+1,visited);
        helper(grid,rows,cols,row-1,col,visited);
        helper(grid,rows,cols,row,col-1,visited);
        return;
    }

    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        boolean[][] visited = new boolean[rows][cols];
        int ans = 0;
        for(int row = 0;row<rows;row++){
            for(int col = 0;col<cols;col++){
                if(visited[row][col]) continue;
                if(grid[row][col] == '1'){
                    ans++;
                    helper(grid,rows,cols,row,col,visited);
                }
            }
        }
        return ans;
    }
}