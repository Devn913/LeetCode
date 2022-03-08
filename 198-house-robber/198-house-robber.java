class Solution {
    public int rob(int[] nums, int index, int[] dp){
        if(index >= nums.length) return 0;
        if(dp[index]!=-1) return dp[index];
        dp[index] = Math.max(nums[index] + rob(nums,index+2,dp),rob(nums,index+1,dp));
        return dp[index];
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i = 0;i<nums.length;i++) dp[i] = -1;
        return rob(nums,0,dp);
    }
}