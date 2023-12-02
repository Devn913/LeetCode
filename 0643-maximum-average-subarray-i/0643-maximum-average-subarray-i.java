class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int low = 0;
        int high = k;
        double sum = 0;
        for(int i = 0;i<k;i++){
            sum+=nums[i];
        }

        double ans = 0.0;
        ans = sum/k;
        while(high!=nums.length){
            sum-=nums[low];
            sum+=nums[high];
            ans = Math.max(ans,sum/k);
            low++;
            high++;
        }
        return ans;
    }
}