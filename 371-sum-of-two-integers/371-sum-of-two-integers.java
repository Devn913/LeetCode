class Solution {
    public int getSum(int a, int b) {
        if(b == 0) return a;
        if(a == 0) return b;
        return getSum(a^b, (a&b)<<1);
    }
}