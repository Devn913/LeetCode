class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        int counter = 0;
        int res = 0;
        while(n!=0){
            if(n%2==0){
                res = res + (int)Math.pow(2,counter);
            }
            n = n/2;
            counter++;
        }
        return res;
    }
}