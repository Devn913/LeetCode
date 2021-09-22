class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for(short i = 0;i<nums.length;i++){
            if(nums[i]<0) sign = -sign;
            else if(nums[i] ==0) return 0;
        }
        return sign;
    }
}
