class Solution {
    public int longestSubarray(int[] nums) {
        int maxNum = Integer.MIN_VALUE;
        int count = 0;
        int ans = 1;
        for(int num: nums){
            if(num==maxNum) count++;
            else if(num>maxNum){
                ans = 1;
                count = 1;
                maxNum = num;
            }else{
                count = 0;
            }
            ans = Math.max(ans,count);
            
        }
        return ans;
    }
}