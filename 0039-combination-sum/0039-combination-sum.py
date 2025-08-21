class Solution:
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        res = []
        def helper(temp, index, current_sum,candidates, target):
            if(index>=len(candidates)): 
                return
            if(current_sum>target): 
                return 
            if(current_sum == target):
                res.append(temp[:])
                return
            
            temp.append(candidates[index])
            helper(temp,index,current_sum+candidates[index], candidates, target)
            temp.pop()
            helper(temp,index+1,current_sum,candidates, target)
            return

        helper([],0,0, candidates, target)

        return res
