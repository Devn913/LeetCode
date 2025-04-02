class Solution {
    
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2;i<n;i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n-1];
    }



    // Approach 2: Memoization with HashMap
    // HashMap<Integer,Integer> map = new HashMap<>();
    // public int climbStairs(int n) {
    //     if(n == 1) return 1;
    //     if(n == 2) return 2;
    //     if(map.containsKey(n)) return map.get(n);
    //     int nAns = climbStairs(n-1) + climbStairs(n-2);
    //     map.put(n,nAns);
    //     return nAns;
    // }
    
    // Approach 1: Recursion (TLE)
    // public int climbStairs(int n) {
    //     if(n == 1) return 1;
    //     if(n == 2) return 2;
    //     return climbStairs(n-1) + climbStairs(n-2);

    // }
}