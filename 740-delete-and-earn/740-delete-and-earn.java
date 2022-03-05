class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] freq = new int[100001];
        for(int num: nums){
            freq[num]++;
        }
        int inc = 0;
        int exc = 0;
        for(int i = 0;i<=10000;i++){
            int ni = exc+freq[i]*i;
            int ne = Math.max(inc,exc);
            inc = ni;
            exc = ne;
        }
        return Math.max(inc,exc);
    }
}