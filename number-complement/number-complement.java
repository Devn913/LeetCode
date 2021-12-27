class Solution {
    public int findComplement(int n) {
        if(n==0) return 1;
        int res = 0;
        int c = 0;
        while(n!=0){
            if(n%2==0) res += (int)Math.pow(2,c);
            c++;
            n = n/2;
        }
        return res;
    }
}