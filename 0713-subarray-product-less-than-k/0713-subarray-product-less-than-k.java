class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans = 0;
        int start = 0;
        int end = 0;
        int product = 1;
        for(end = 0;end<nums.length; end++){
            product = product*nums[end];
            while(start<=end && product>=k){
                product = product/nums[start];
                start++;
            }
            ans+=end-start+1;
            
        }

        return ans;

    }
}