class Solution:
    

    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        memo = [-1]*n
        def max_ans(nums,index):
            if(index>=n): 
                return 0
            if(index == len(nums)-1):
                return nums[-1]
            if(memo[index]!=-1):
                return memo[index]
            
            memo[index] = max(nums[index]+max_ans(nums,index+2),max_ans(nums,index+1))
            return memo[index]
        return max_ans(nums,0)
    
  
