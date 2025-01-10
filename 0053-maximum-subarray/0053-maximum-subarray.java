class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int maxTillNow = 0;
        for(int i =0;i<nums.length;i++){
            maxTillNow+=nums[i];
            maxSum = Math.max(maxTillNow,maxSum);
            if(maxTillNow<0) maxTillNow = 0;
        }
        return maxSum;

    }
}