class Solution {

    public int longestNiceSubarray(int[] nums) {
        int ans   = 0;
        int start = 0;
        int end   = 0;
        int curr  = 0;
        while(end<nums.length){
            while(end< nums.length && (curr & nums[end]) == 0 ){
                curr = curr | nums[end];
                ans = Math.max(ans,end-start+1);
                end++;

            }
            curr = curr ^ nums[start];
            start++;
        }
        return ans;
    }
}
/*
0 1 1 0 1


0 1 0 0 0

*/