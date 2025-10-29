class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        memo = {}
        def helper(index, min_till_now):
            if(index>=len(prices)):
                return 0
            if((index,min_till_now) in memo):
                return memo[(index,min_till_now)]
            ans = 0
            if(prices[index]>prices[min_till_now]):
                ans = (prices[index] - prices[min_till_now]) + helper(index+1,index+1)

            if(prices[min_till_now] > prices[index]):
                min_till_now = index
            memo[(index,min_till_now)] = max(ans,helper(index+1,min_till_now))
            return memo[(index,min_till_now)]

        return helper(0,0)