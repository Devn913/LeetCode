class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length ==1) return 0;
        // if(nums.length == 2) return Math.abs(nums[1]-nums[0]);
        Arrays.sort(nums);
        int median = nums.length%2 != 0 ? nums[nums.length/2] : (nums[nums.length/2-1] + nums[nums.length/2])/2;
        int steps = 0;
        for(int num: nums){
            steps+=(Math.abs(num-median));
        }
        return steps;
    }
}