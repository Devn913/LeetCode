class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) sum+=num;
        if(sum%2!=0) return false;
        sum = sum/2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for(int i = 0;i<=sum;i++) dp[0][i] = false;
        for(int i = 0;i<=nums.length;i++) dp[i][0] = true;
        for(int i = 1;i<=nums.length;i++){
            for(int j = 1;j<=sum;j++){
                dp[i][j] = dp[i-1][j];
                if(!dp[i][j]){
                    int val =  nums[i -1];
                    if(j>=val) dp[i][j] = dp[i-1][j-val];
                }
            }
            // if(dp[i][sum]) return true;
        }
        return dp[nums.length][sum];
    }
}