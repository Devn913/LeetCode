class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=3) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;
        for (int left = 0, right = n - 4; left < 4; left++, right++) {
            minDiff = Math.min(minDiff, nums[right] - nums[left]);
        }
        return minDiff;
    }
}
