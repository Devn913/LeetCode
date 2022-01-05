class Solution {
    public boolean canJump(int[] nums) {
        int left = 0;
        int right = nums[0];
        while(right<nums.length - 1){
            int max = 0;
            for(int i = left;i<=right;i++){
                max = Math.max(max,i+nums[i]);
            }
            if(max == right ) return false;
            left = right+1;
            right = max;
        }
        return true;
    }
}