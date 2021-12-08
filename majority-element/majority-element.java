class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int target = nums.length/2;
        int counter =0;
        while(target<nums.length){
            if(nums[counter] == nums[target]){
                return nums[counter];
            }
            ++counter;
            ++target;
        }
        return -1;
    }
}