class Solution {
    private int helper(int[] nums, int index, int val){
        if(index == nums.length){
            if(val == 0) return 1;
            else return 0;
        }
        return helper(nums,index+1,val-nums[index]) + helper(nums,index+1,val+nums[index]);
        
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,0,target);
    }
}