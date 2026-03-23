class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        n = len(nums)
        for i in range(n):
            index = abs(nums[i]) - 1
            if(nums[index]>0):
                nums[index] = -nums[index]

        res = []
        for i in range(n):
            if(nums[i]>0):
                res.append(i+1)
        return res 