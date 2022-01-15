class Solution {
    public int sumOfDigitSquare(int n){
        int ans = 0;
        while(n!=0){
            int digit = n%10;
            ans+=(digit*digit);
            n = n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1){
            int nextNum = sumOfDigitSquare(n);
            if(set.contains(nextNum)) return false;
            set.add(nextNum);
            n = nextNum;
        }
        return true;
    }
}