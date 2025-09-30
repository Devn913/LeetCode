class Solution {
    public int triangularSum(int[] nums) {
        for(int index = nums.length-1;index!=0;index--){
            for(int i = 0;i<index;i++){
                nums[i] = (nums[i] + nums[i+1])%10;
            }
        }
        return nums[0];

    }
}   