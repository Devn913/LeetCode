class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        int sum = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length-1;i++){
            int start = i+1;
            int end   = nums.length-1;
            while(start<end){
                int currentSum = nums[i]+nums[start]+nums[end];
                if(Math.abs(currentSum-target)< sum){
                    ans = currentSum;
                    sum = Math.abs(currentSum-target);
                }
                if(currentSum>target){
                    end--;
                }else{
                    start++;
                }
             }
        }
        return ans;
    }
}