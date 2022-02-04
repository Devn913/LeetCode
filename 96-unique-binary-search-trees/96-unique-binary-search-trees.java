class Solution {
    public int numTrees(int n) {
        if(n<3) return n;
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for(int i =3 ;i<n+1;i++){
            int val = 0;
            for(int j = 0;j<i;j++){
                val+=(dp[j]*dp[i-j-1]);
            }
            dp[i] = val;
        }
        return dp[n];
        
    }
}