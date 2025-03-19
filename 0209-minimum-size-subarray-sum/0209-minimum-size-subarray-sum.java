class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int end = 0;
        int currentSum = 0;
        int ans = Integer.MAX_VALUE;
        while(end<=nums.length){
            while(start<=end && currentSum>=target){
                ans = Math.min(ans,end-start);
                currentSum-=nums[start++];
            }
            if(end == nums.length){
                break;
            }
            currentSum+=nums[end];
            end++;
        }
        if(ans == Integer.MAX_VALUE) return 0;
        return ans;
    }
}