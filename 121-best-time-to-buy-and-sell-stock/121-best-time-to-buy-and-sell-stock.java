class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0;i<prices.length;i++){
            int val = prices[i] - minTillNow;
            if(val>max) max = val;
            minTillNow = Math.min(minTillNow,prices[i]);
        }
        return max;
    }
}