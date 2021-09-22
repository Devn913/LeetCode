class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int s1 = 0;
        int s2 = 1;
        int res = 0;
        int counter = 0;
        while(counter<n-1){
            res = s1+ s2;
            s1 = s2;
            s2 = res;
            counter++;
        }
        return res;
    }
}
