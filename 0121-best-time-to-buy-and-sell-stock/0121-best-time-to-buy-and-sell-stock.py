class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        ans = 0
        m = prices[0]
        for p in prices:
            ans = max(ans, p - m)
            m = min(m,p)
        return ans