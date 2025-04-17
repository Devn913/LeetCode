class Solution {

    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);
        if(nums.length == 3) return Math.max(nums[0],Math.max(nums[1],nums[2]));
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        int ans1 = 0;
        for(int i = 2;i<nums.length - 1;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            ans1 = dp[i];
            System.out.println(Arrays.toString(dp));
        }
        int ans2 = 0;
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);
        for(int i = 3;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
            ans2 = dp[i];
            System.out.println(Arrays.toString(dp));
        }
        return Math.max(ans1,ans2);
    
    }
}