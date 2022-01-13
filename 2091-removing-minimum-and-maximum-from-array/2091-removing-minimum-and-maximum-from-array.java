class Solution {
    public int minimumDeletions(int[] nums) {
        if(nums.length == 1) return 1;
        int max = 0;
        int min = 0;
        int len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i]<nums[min]) min  = i;
            if(nums[i]>nums[max]) max  = i;
        }
        if(min>max){
            int temp = min;
            min = max;
            max = temp;
        }
        return Math.min(max+1,Math.min(len - min, min + 1 + len - max));
    }
}