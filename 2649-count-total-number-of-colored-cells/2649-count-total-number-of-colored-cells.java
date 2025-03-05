class Solution {
    public long coloredCells(int n) {
        // 1, 1+4, 1+4+8, 1+4+8+12 ...
        long ans = 1;
        long last = 4;
        while(n--!=1){
            ans +=  last;
            last +=4;
        } 
        return ans;
    }
}