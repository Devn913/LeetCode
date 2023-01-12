class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) sum+=num;
        if(sum%2!=0) return false;
        sum = sum/2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for(int i = 0;i<=sum;i++) dp[0][i] = false;
        for(int i = 0;i<=nums.length;i++) dp[i][0] = true;
        for(int row = 1;row<=nums.length;row++){
            for(int col = 1;col<=sum;col++){
                dp[row][col] = dp[row-1][col];
                if(!dp[row][col]){
                    int val = nums[row-1];
                    if(col>=val) dp[row][col] = dp[row-1][col-val];
                }
            }
            if(dp[row][sum]) return true;
        }
        return dp[nums.length][sum];
        
    }
}