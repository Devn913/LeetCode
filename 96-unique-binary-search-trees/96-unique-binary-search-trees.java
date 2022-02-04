class Solution {
    public int numTrees(int n) {
        if(n<3) return n;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i =2 ;i<n+1;i++){
            for(int j = 0;j<i;j++){
                dp[i]+=(dp[j]*dp[i-j-1]);
            }
        }
        return dp[n];
        
    }
}