class Solution {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        int counter =0;
        while(counter<nums.length){
            result[counter] = nums[nums[counter]];
            counter++;
        }
        return result;
    }
}