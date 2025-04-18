
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


// Method 2         : Memoization: Accepted 
// Time complexity  : O(n)
// Space Complexity : O(n) + recursion stack memory
// class Solution {
//     public int helper(int[] nums, int[] dp, int currentIndex){
//         if(currentIndex >= nums.length) return 0;
//         if(dp[currentIndex] != -1) return dp[currentIndex];
//         int currentHouse = nums[currentIndex] + helper(nums,dp,currentIndex+2);
//         dp[currentIndex] = Math.max(currentHouse, helper(nums,dp,currentIndex+1));
//         return dp[currentIndex];
//     }
//     public int rob(int[] nums) {
//         int[] dp = new int[nums.length];
//         for(int i =0;i<nums.length;i++){
//             dp[i] = -1;
//         }
//         return helper(nums,dp,0);
//     }
// }

// Method 2         : Dynammic Programming: Accepted  (Most opmtimized)
// Time complexity  : O(n)
// Space complexity : O(n)
class Solution {


    public int helper(int[] house, int currentHouse,int[] memo){
        if(currentHouse>=house.length) return 0;
        if(memo[currentHouse] != -1) return memo[currentHouse];

        int currentHouseLoot = house[currentHouse] + helper(house,currentHouse+2,memo);
        int notLoot          = helper(house,currentHouse+1,memo);

        memo[currentHouse] = Math.max(currentHouseLoot,notLoot);
        return memo[currentHouse];
    }



    public int rob(int[] nums) {
        int[] memo = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            memo[i] = -1;
        }
        return helper(nums,0,memo);

    }
}




