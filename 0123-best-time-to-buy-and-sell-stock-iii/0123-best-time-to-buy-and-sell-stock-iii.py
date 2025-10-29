class Solution:


    def maxProfit(self, prices: List[int]) -> int:
        
        n = len(prices)
        buy  = [0]*n
        sell = [0]*n
        mn   = prices[0]
        for i in range(1,n):
            sell[i] = max(0,prices[i] - mn)
            mn = min(mn,prices[i])

        mx = prices[n-1]
        for i in range(n-2,-1,-1):
            buy[i] = max(0,mx - prices[i])
            mx = max(mx,prices[i])
        
        print(sell)
        mx = buy[-1]
        for i in range(n-1,-1,-1):
            mx = max(mx,buy[i])
            buy[i] = mx
        print(sell)
        
        ans = sell[-1]
        for i in range(n-1):
            ans = max(ans,sell[i]+buy[i+1])
        return ans

            