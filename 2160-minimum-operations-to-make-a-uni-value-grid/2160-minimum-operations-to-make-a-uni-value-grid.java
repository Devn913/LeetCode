class Solution {

    public int minOperations(int[][] grid, int x) {
        int[] ansArray = new int[grid.length * grid[0].length];
        
        int index = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                ansArray[index] = grid[i][j];
                index++;
            }
        }
        Arrays.sort(ansArray);
        int median = ansArray[ansArray.length / 2];
        int ans = 0;
        int remiander = grid[0][0] % x;
        for (int num : ansArray) {
            if (num % x != remiander)
                return -1;
            ans += (Math.abs(median - num) / x);
        }
        return ans;

    }
}