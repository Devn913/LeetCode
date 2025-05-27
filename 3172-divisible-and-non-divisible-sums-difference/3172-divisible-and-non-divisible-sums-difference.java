class Solution {
    public int differenceOfSums(int n, int m) {
        int sum = 0;
        int current = m;
        int count = 2;
        while(current<=n){
            sum += current;
            current = count*m;
            count++;
        }
        return n*(n+1)/2 - 2*sum;
    }
}