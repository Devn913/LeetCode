class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res = []
        curr_path = []

        def dfs(index):
            if(index==len(nums)):
                res.append(curr_path[:])
                return
            
            curr_path.append(nums[index])
            dfs(index+1)
            curr_path.pop()
            dfs(index+1)
        dfs(0)
        return res