class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int num: nums) max = Math.max(max,num);
        int start,end,freq = 0;
        long ans = 0;
        for(start = 0,end = 0;end<nums.length;end++){
            if(nums[end] == max) freq++;
            while(freq==k){
                if(nums[start] == max) freq--;
                start++;
            }
            ans+=start;
            

        }
        return ans;
    }
}