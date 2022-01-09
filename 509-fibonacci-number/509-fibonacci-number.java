class Solution {
    public int fib(int n) {
        if(n<2) return n;
        int first = 0;
        int second = 1;
        int current = first + second;
        while(n!=1){
            current = first+second;
            first = second;
            second = current;
            --n;
        }
        return current;
        
    }
}