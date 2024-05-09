class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int index = happiness.length - 1;
        long ans = 0;
        for(int i = 0;i<k;i++){
            int number = happiness[index--] - i;
            if(number<0) number = 0;
            ans+=number;
        }
        return ans;
    }
}