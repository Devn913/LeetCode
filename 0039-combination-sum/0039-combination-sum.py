class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        
        res = []

        def helper(temp, current_sum, current_index):
            if(current_index>= len(candidates) or current_sum>target):
                return 
            if(current_sum == target):
                res.append(temp[:])
                return
            
            temp.append(candidates[current_index])
            helper(temp,current_sum+candidates[current_index],current_index)
            temp.pop()
            helper(temp,current_sum,current_index+1)
            return
        helper([],0,0)
        return res