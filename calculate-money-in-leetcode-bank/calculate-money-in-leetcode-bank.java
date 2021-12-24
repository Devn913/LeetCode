class Solution {
    public int totalMoney(int n) {
        int res = 0;
        int counter = 0;
        while(n>=7){
            res = res + 28 + counter*7;
            counter++;
            n = n-7;
        }
        if(n!=0) res = res + ((n)*(2*(counter+1) + (n-1)))/2;
            //S = n/2[2a + (n − 1) × d]
        return res;
    }
}