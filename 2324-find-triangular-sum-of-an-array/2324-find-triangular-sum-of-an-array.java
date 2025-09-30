class Solution {
    public int helper(int[] nums, int index){
        if(index == 0){
            return nums[0];
        }
        for(int i = 0;i<index;i++){
            nums[i] = (nums[i] + nums[i+1])%10;
        }
        return helper(nums,index-1);
    }
    public int triangularSum(int[] nums) {
        return helper(nums,nums.length-1);

    }
}   