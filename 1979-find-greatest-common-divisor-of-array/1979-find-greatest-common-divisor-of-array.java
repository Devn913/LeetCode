class Solution {
    public int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a,a);
    }
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            min = Math.min(num,min);
            max = Math.max(num, max);
        }
        return gcd(max,min);
    }
}