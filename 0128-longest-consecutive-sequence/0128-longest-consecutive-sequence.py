class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if(len(nums) == 0):
            return 0
        nums.sort()
        ans = 0
        cnt = 1
        for i in range(1,len(nums)):
            if(nums[i] == nums[i-1]):
                continue
            if(nums[i] == nums[i-1]+1):
                cnt+=1
            else:
                ans = max(ans,cnt)
                cnt= 1
        return max(ans,cnt)
