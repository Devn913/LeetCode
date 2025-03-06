class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = {-1,-1};
        int n = grid.length;
        boolean[] visited = new boolean[n*n];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                int val = grid[i][j];
                if(visited[val - 1] == true){
                    ans[0] = val;
                }
                visited[val - 1] = true;
            }
        }
        for(int i = 0;i<visited.length;i++){
            if(visited[i] == false){
                ans[1] = i+1;
                break;
            }
        }
        return ans;
    }
}