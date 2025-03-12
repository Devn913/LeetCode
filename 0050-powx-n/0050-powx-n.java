class Solution {
    public double myPow(double x, long n) {
        if(n<0) {
            n = -1*n;
            x = 1/x;
        }
        double ans = 1;
        while(n!=0){
            int bit =(int) (n & 1);
            if(bit==1) ans = ans*x;
            x = x*x;
            n = n >> 1;
        }
        return ans;
    }
}