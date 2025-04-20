// Approach: 1 Recurssion TLE
// class Solution {
//     public boolean findSum(int[] nums, int size, long sum){
//         if(size<1) return false;
//         if(size == 1){
//             if(sum == nums[size-1]) return true;
//             return false;
//         }
//         return findSum(nums,size-1,sum) || findSum(nums,size-1,sum-nums[size-1]);
//     }
//     public boolean canPartition(int[] nums) {
//         long sum = 0;
//         for(int num: nums) sum+=num;
//         if(sum % 2 != 0) return false;
//         sum = sum/2;
//         return findSum(nums, nums.length,sum);       
//     }
// }

// Approach 2: Memoization
// class Solution {
//     public boolean findSum(int[] nums, int[][] memo, int size, int sum){
//         if(size<1 || sum<0) return false;
//         if(size == 1){
//             if(sum == nums[size-1]) return true;
//             return false;
//         }
//         if(memo[size][sum] != -1) return (memo[size][sum] == 1);
//         if(findSum(nums,memo,size-1,sum) || findSum(nums,memo,size-1,sum-nums[size-1])){
//             memo[size][sum] = 1;
//         }else{
//             memo[size][sum] = 0;
//         }
//         return memo[size][sum] == 1;
//     }
//     public boolean canPartition(int[] nums) {
//         long sum = 0;
//         for(int num: nums) sum+=num;
//         if(sum % 2 != 0) return false;
//         sum = sum/2;
//         int[][] memo = new int[nums.length+1][(int) sum+1];
//         for(int i = 0;i<memo.length;i++){
//             for(int j = 0;j<memo[0].length;j++){
//                 memo[i][j] = -1;
//             }
//         }
//         return findSum(nums,memo, nums.length,(int) sum);      
//     }
// }

// Approach 3: DP
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums) sum+=num;
        if(sum % 2 != 0) return false;
        sum = sum/2;
        boolean[][] dp = new boolean[nums.length+1][sum+1];

        for(int i = 1;i<=nums.length;i++){
            for(int j = 0;j<=sum;j++){
                if(i == 1){
                    if(j == nums[i-1]) dp[i][j] = true;
                    else dp[i-1][j] = false;
                }else{
                    dp[i][j] = dp[i-1][j];
                    if(dp[i][j] == false && j-nums[i-1]>0){
                        dp[i][j] = dp[i-1][j-nums[i-1]];
                    } 
                }
            }
        }
        return dp[nums.length][sum];
        
    }
}