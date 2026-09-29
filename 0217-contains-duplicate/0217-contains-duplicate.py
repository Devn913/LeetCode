class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        nums.sort()
        n = len(nums) - 1
        for i in range(n):
            if nums[i] == nums[i+1]:
                return True
        return False