class Solution {
    public int helper(int[] memo, int n){
        if(n == 1) return 1;
        if(n==2) return 2;
        if(memo[n]!=-1) return memo[n];
        memo[n] = helper(memo,n-1)+helper(memo,n-2);
        return memo[n];
         
    }
    public int climbStairs(int n) {
        int[] memo = new int[n+1];
        for(int i = 0;i<=n;i++){
            memo[i] = -1;
        }
        return helper(memo,n);
    }
}