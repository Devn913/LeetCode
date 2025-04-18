class Solution {
    // Approach: 4
    //
    public int climbStairs(int n) {
        if(n == 1) return 1;
        if(n == 2) return 2;
        int prev = 1;
        int lastPrev = 2;
        int ans = prev+lastPrev;
        for(int i = 3;i<=n;i++){
            ans = prev+lastPrev;
            prev = lastPrev;
            lastPrev = ans;
        }
        return ans;
    }

    // // Approach 3: Dynammic Programming
    // public int climbStairs(int n) {
    //     int[] dp = new int[n+1];
    //     dp[1] = 1;
    //     dp[2] = 2;
    //     for(int i = 3;i<=n;i++){
    //         dp[i] = dp[i-1]+dp[i-2];
    //     }
    //     return dp[n];

    // }



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