class Solution {
    public int maxProfit(int[] prices) {
        int minTillNow = prices[0];
        int maxProfit = 0;
        for(int i = 1;i<prices.length;i++){
            maxProfit = Math.max(maxProfit,prices[i]-minTillNow);
            minTillNow = Math.min(minTillNow,prices[i]);
        }
        return maxProfit;
    }
}