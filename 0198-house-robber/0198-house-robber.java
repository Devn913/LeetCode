
// Method: 1 - Recusrison [Time Limit Exceed (TLE)]
// class Solution {
//     public int helper(int[] nums, int currentIndex){
//         if(currentIndex >= nums.length) return 0;
//         int currentHouse = nums[currentIndex] + helper(nums,currentIndex+2);
//         return Math.max(currentHouse, helper(nums,currentIndex+1));
//     }
//     public int rob(int[] nums) {
//         return helper(nums,0);
//     }
// }


// Method 2: Memoization
class Solution {
    public int helper(int[] nums, int[] dp, int currentIndex){

        if(currentIndex >= nums.length) return 0;
        if(dp[currentIndex] != -1) return dp[currentIndex];
        int currentHouse = nums[currentIndex] + helper(nums,dp,currentIndex+2);
        dp[currentIndex] = Math.max(currentHouse, helper(nums,dp,currentIndex+1));
        return dp[currentIndex];
    }
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            dp[i] = -1;
        }
        return helper(nums,dp,0);
    }
}



