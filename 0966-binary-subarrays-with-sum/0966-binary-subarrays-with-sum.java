class Solution {
    public int helper(int[] nums, int goal){
        int ans = 0;
        int currentSum = 0;
        for(int start = 0, end =0;end<nums.length;){
            currentSum+=nums[end];
            while(start<=end && currentSum>goal){
                currentSum-=nums[start];
                start++;
            }
            ans+=(end-start+1);
            end++;
            
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums,goal) - helper(nums,goal-1);
    }
}