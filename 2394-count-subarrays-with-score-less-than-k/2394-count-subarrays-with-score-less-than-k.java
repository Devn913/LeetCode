class Solution {
    public long countSubarrays(int[] nums, long k) {
        long ans = 0, score=0,currentSum = 0;
        int start, end;
        for(start =0,end =0;end<nums.length;){
            score+=nums[end];

            while(start<=end && score*(end-start+1)>=k){
                score = score  - nums[start];
                start++;

            }
                ans += (end-start+1);
                
            end++;

            
            // System.out.println(start + " " + end + " : " + currentSum + " " +score);
  

        }
        return ans;
    }
}