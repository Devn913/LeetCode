class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<grid.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<grid[0].length;j++){
                sb.append(Integer.toString(grid[i][j]));
                sb.append(",");
            }
            map.put(sb.toString(),map.getOrDefault(sb.toString(),0)+1);
        }
        int ans = 0;
        for(int i = 0;i<grid.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j =0;j<grid[0].length;j++){
                sb.append(Integer.toString(grid[j][i]));
                sb.append(",");
            }
            ans+=map.getOrDefault(sb.toString(),0);
        }
        return ans;
    }
}