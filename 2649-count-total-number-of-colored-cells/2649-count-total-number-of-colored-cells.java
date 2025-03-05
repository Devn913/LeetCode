class Solution {
    public long coloredCells(int n) {
        long ans = 0;
        long last = 1;
        while(n!=1){
            ans +=  last;
            last = last+2;
            n--; 
        }
        ans  = 2*ans+last;
        return ans;
    }
}