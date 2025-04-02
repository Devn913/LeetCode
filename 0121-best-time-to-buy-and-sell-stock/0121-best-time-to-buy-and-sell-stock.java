class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int n = prices.length;
        int maxTillNow = prices[n-1];
        for(int i = n-2;i!=-1;i--){
            ans = Math.max(ans,maxTillNow - prices[i]);
            maxTillNow = Math.max(maxTillNow,prices[i]);
        }
        return ans;
    }
}