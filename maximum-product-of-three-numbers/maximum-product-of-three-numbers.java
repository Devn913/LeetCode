class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int num1 = nums[len-1]*nums[len-2]*nums[len-3];
        int num2 = nums[0]*nums[1]*nums[2];
        int num3 = nums[0]*nums[1]*nums[len-1];
        int num4 = nums[0]*nums[len-1]*nums[len-2];
        return Math.max(Math.max(num1,num2),Math.max(num3,num4));
    }
}