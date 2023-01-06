class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long nn = n;
        if(nn<0) nn = -1*nn;
        while(nn>0){
            if(nn%2==0){
                x = x*x;
                nn = nn/2;
            }else{
                ans = ans*x;
                nn--;
            }
        }
        if(n<0) ans = (1.0)/ans;
        return ans;
        
    }
}