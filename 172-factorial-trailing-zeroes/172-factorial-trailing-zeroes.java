class Solution {
    public int trailingZeroes(int n) {
        while(n%5!=0){
            n--;
        }
        int count = 0;
        while(n!=0){
            n = n/5;
            count+=n;
        }
        return count;
    }
}