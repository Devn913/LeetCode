class Solution {
    public int passThePillow(int n, int time) {
        int val = time/(n-1);
        int val2 = time%(n-1);
        if(val%2!=0) return n-val2;
        return val2+1;
    }
}