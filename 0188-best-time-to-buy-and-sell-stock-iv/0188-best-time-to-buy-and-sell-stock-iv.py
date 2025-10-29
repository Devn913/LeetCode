class Solution:
    def maxProfit(self, k: int, prices: List[int]) -> int:
        n = len(prices)
        memo = {}
        def helper(index, buy, curr):
            if(index == n or curr == k):
                return 0
            ans = 0
            if((index,curr,buy) in memo):
                return memo[(index,curr,buy)]
            if buy:
                ans = max(
                    -prices[index] + helper(index+1,not buy, curr),
                    helper(index+1,buy,curr)
                )
            else:
                ans = max(
                    prices[index] + helper(index+1,not buy,curr+1),
                    helper(index+1,buy,curr)
                )
            memo[(index,curr,buy)]= ans
            return ans
        return helper(0,True,0)
        