class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int max = 0;
        dp[nums.length-1] = 1;
        for(int i = nums.length -1;i!=-1;i--){
            dp[i] = 1;
            for(int j = i+1; j<nums.length;j++){
                if(nums[j]>nums[i]) dp[i] = Math.max(dp[i],1+dp[j]);
            }
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}