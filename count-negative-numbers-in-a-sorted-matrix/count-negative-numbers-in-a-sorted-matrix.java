class Solution {
    public int countNegatives(int[][] grid) {
        int result = 0;
        for(int i = 0;i<grid.length;i++){
            int counter = grid[i].length-1;
            while(counter!=-1 && grid[i][counter]<0){
                result++;
                counter--;
            }
        }
        return result;
    }
}