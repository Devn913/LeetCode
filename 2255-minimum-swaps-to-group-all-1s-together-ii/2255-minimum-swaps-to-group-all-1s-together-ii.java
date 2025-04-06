class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;

        for (int num : nums) {
            if(num == 1){
                ones++;
            }
        }
        int ans = ones;
        int start = 0;
        int end = 0;
        int zeroCount = 0;
        while(end<ones){
            if(nums[end] == 0) zeroCount++;
            end++;
        }
        ans = zeroCount;
        while(start<nums.length){
            if(nums[start] == 0) zeroCount--;
            if(nums[end%nums.length] == 0)zeroCount++;
            start++;
            end++;
            ans = Math.min(ans,zeroCount);
        }
        return ans;
    }
}