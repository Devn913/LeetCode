class Solution {
    public int minCost(int[] cost, int currentIndex, int[] dp){
        if(currentIndex>=cost.length) return 0;
        if(currentIndex  == cost.length - 1) return cost[currentIndex];
        if(dp[currentIndex]!=-1) return dp[currentIndex];
        int ans = Integer.MAX_VALUE;
        if(dp[currentIndex+1] != -1) ans = Math.min(ans,dp[currentIndex+1]);
        else ans = Math.min(ans,minCost(cost,currentIndex+1,dp));
        if(dp[currentIndex+2] != -1) ans = Math.min(ans,dp[currentIndex+2]);
        else ans = Math.min(ans,minCost(cost,currentIndex+2,dp));
        dp[currentIndex] =cost[currentIndex] +  ans;
        return dp[currentIndex];
    }
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length+2];
        for(int i = 0;i<cost.length;i++) dp[i] = -1; 
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));        
    }
}