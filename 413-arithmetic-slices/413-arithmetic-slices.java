class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3) return 0;
        int[] dp = new int[nums.length+1];
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 0;
        dp[3] = 1;
        for(int i = 4;i<=nums.length;i++){
            dp[i] = dp[i-1] + i-2;
        }
        int i = 0;
        int j = 1;
        int result = 0;
        while(j<nums.length){
            int currentStreak = 2;
            int k = j+1;
            while(k<nums.length && nums[i]-nums[j] == nums[k-1]-nums[k]){
                k++;
                currentStreak++;
            }
            result+=dp[currentStreak];
            i = k-1;
            j = k;
        }
        return result;
    }
}