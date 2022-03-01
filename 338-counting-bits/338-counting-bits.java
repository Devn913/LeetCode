class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        res[0] = 0;
        if(n == 0) return res;
        for(int i = 1;i<=n;i++){
            if(i%2==0) res[i] = res[i/2];
            else res[i] = res[i-1]+1;
        }
        return res;
    }
}