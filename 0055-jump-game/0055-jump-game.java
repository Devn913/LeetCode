class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1) return true;
        int curr = 0;
        int currMax = nums[0];
        int start = 0;
        while(start<=currMax && start<=nums.length-1){
            int nextMax = start+nums[start];
            while(start<=currMax && start<=nums.length-1){
                nextMax = Math.max(nextMax,start+nums[start]);
                start++;
            }
            if(nextMax >= nums.length-1) return true;
            if(currMax == nextMax) return false;
            currMax = nextMax;
            
        }
        return currMax>=nums.length-1;

    }
}