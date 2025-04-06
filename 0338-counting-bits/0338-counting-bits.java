class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            int[] ans = {0};
            return ans;
        }
        int[] dp = new int[n+1];

        dp[0] = 0;

        dp[1] = 1;
        for(int i = 2;i<=n;i++){
            dp[i] = dp[i>>1] + (i%2);
        }
        return dp;
    }
}