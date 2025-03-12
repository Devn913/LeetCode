class Solution {
    public double myPow(double x, int n) {
        long nn = n;   
        if(n<0) { nn = -1*nn; x = 1/x;}
        double tempAns = x;
        double ans = 1;
        while(nn!=0){
            int bit =(int) (nn & 1);
            if(bit==1) ans = ans*tempAns;
            tempAns = tempAns*tempAns;
            nn = nn >> 1;
        }
        return ans;
    }
}