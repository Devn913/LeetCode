class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 1;
        int zeros = 0;
        int lastZero = -1;
        int max = 0;
        if(nums[i] == 0){
            lastZero = i;
            zeros++;
        }
        while(j<nums.length){
            if(nums[j] == 0){
                zeros++;
                if(lastZero == -1) lastZero = j;
            }
            if(zeros<2){
                max = Math.max(max,j - i);
            }else{
                zeros = 1;
                i = lastZero+1;
                lastZero = j;
            }
            j++;
        }
        return max;
        
    }
}