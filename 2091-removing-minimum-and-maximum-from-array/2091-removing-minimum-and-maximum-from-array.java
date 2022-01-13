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
        int res = Integer.MAX_VALUE;
        res = Math.min(res,Math.max(min,max)+1);
        res = Math.min(res,len - Math.min(min,max));
        res = Math.min(res,Math.min(min,max) +1 + len - Math.max(min,max));
        return res;
    }
}