class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        ans[0] = 0;
        for(int i = 1;i<=n;i++){
            ans[i] = ans[i>>1]+(i%2);
        }
        return ans;
    }
}