class Solution {
    public int findTheWinner(int n, int k) {
        if(k == 1) return n;
        boolean[] val = new boolean[n];
        int counter = 0;
        int a = 0;
        int resetK = 0;
        while(counter!=n){
            if(val[a] ==  false) resetK++;
            if(resetK == k){
                val[a] = true;
                counter++;
                resetK = 0;
            }
            a++;
            if(a==n) a = 0;

        }
        if(a == 0){
            if(val[a] == false) return a;
            else return n;
        }
        return a;
    }
}