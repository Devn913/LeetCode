class Solution {
    public int findDuplicate(int[] nums) {
        for(int num: nums){
            int index = Math.abs(num) - 1;
            if(nums[index]<0) return index+1;
            nums[index] = -nums[index];
        }
        return -1;
    }
}