class Solution {
    public double helper(double x, long n){
        if(n==0) return 1;
        if(n%2==0){
            return helper(x*x,n/2);
        }else{
            return x*helper(x,--n);
        }
    }
    public double myPow(double x, int n) {
        if(n<0){
            long nn = n;
            nn = -1*nn;
            return (1.0)/helper(x,nn);
        }
        return helper(x,n);
        
    }
}