class Solution {
    public int minOperations(int n) {
        int median;
        if(n%2==0){
            median = ((2*(n/2) )+1 + (2*(n/2 - 1)) + 1)/2;
        }else{
            median = 2*(n/2)+1;
        }
        int c1 = 0;
        int ans = 0;
        while(c1<n/2){
            ans+= median - ((2*c1) + 1);
            c1++;
        }
        return ans;
    }
}