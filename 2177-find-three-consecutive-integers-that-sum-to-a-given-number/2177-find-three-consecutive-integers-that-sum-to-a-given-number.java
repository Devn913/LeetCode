class Solution {
    public long[] sumOfThree(long num) {
        num = num - 3 ;
        if(num%3 != 0) return new long[0];
        long[] res = new long[3];
        num = num/3;
        res[0] = num++;
        res[1] = num++;
        res[2] = num;
        return res;
    }
}