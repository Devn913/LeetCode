class Solution {
    public long countSubarrays(int[] nums, long k) {
        long currentSum = 0;
        int start,end;
        long ans =0;
        for(start = 0,end =0;end<nums.length;end++){
            currentSum+=nums[end];
            while(start<=end && currentSum * (end-start+1) >= k ){
                currentSum -= nums[start];
                start++;
            }
            // this portion
            ans+=(end-start+1);
        }
        return ans;
    }
}