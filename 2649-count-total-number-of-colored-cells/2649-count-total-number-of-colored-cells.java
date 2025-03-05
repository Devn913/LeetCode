class Solution {
    public long coloredCells(int n) {

        // Approach 2: 1 + (4×1) + (4×2) +...+ (4×(n−1)) = 1 + 2 × (n−1) × n
        return 1 + (long) n * (n - 1) * 2;




        // // Approach 1:  1, 1+4, 1+4+8, 1+4+8+12 ...
        // long ans = 1;
        // long last = 4;
        // while(n--!=1){
        //     ans +=  last;
        //     last +=4;
        // } 
        // return ans;
    }
}