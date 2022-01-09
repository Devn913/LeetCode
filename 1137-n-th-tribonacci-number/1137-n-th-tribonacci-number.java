class Solution {
    public int tribonacci(int n) {
        if(n<2) return n;
        if(n==2) return 1;
        int first = 0;
        int second = 1;
        int third = 1;
        int current = first + second + third;
        while(--n!=1){
            current = first + second + third;
            first = second;
            second = third;
            third = current;
        }
        return current;
    }
}