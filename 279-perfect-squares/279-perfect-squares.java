class Solution {
    // Memoization
    private int helper(int n, int[] dp){
        if(n<2) return n;
        int ans = n;
        for(int i = 1;i*i<=n;i++){
            if(dp[n - i*i] !=-1){
                ans = Math.min(ans,dp[n - i*i]);
            }else{
                ans = Math.min(ans,helper(n - i*i,dp));
            }
        }
        dp[n] = ans+1;
        return dp[n];
    }
    // Dynamic Programming
    private int helper(int n){
        int[] dp = new int[n+1];
        for(int i = 0;i<=n;i++) dp[i] = -1;
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 1;i<=n;i++){
            int ans = i;
            for(int j = 1;j*j<=i;j++){
                ans = Math.min(ans,dp[i - j*j] +1);
            }
            dp[i] = ans;
        }
        return dp[n];
    }
    public int numSquares(int n) {
        return helper(n);
    }
}