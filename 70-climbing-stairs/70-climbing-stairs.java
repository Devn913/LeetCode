class Solution {
    public int climbStairs(int n) {
        if(n < 3) return n;
        int first = 1;
        int second = 2;
        int ans = first+second;
        while(--n!=1){
            ans = first+second;
            first = second;
            second = ans;
        }
        
        return ans;
    }
}