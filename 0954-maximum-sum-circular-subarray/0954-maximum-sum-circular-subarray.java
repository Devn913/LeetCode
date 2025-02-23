class Solution {
    int total;
    public int maxSubarraySumCircular(int[] nums) {
        int max = kadanes(nums, true);
        int min = kadanes(nums, false);
        return max > 0 ? Math.max(max, total - min) : max;
    }

    private int kadanes(int[] nums, boolean isMax) {
        total = 0; 

        int current = 0; 
        int sum = nums[0]; 

        for (int num : nums) {
            total += num;

            if (isMax) {
                current = Math.max(current + num, num);
                sum = Math.max(sum, current);
            } else {
                current = Math.min(current + num, num);
                sum = Math.min(sum, current);
            }
        }
        return sum; 
    }
}