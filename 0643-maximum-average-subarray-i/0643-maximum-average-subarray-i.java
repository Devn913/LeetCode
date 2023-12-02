class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        double sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }
        double ans = sum/k;
        while(low+k!=nums.length){
            sum-=nums[low];
            sum+=nums[low+k];
            ans = Math.max(ans,sum/k);
            low++;
        }
        return ans;
    }
}