class Solution:
    def combinationSum2(self, arr: List[int], target: int) -> List[List[int]]:
        arr.sort()
        res = []
        def dfs(index, curr, total):
            if(total == target):
                res.append(curr.copy())
                return 
            if(index==len(arr) or total>target):
                return 
            
            curr.append(arr[index])
            dfs(index+1,curr,total+arr[index])
            curr.pop()
            while(index+1<len(arr) and arr[index] == arr[index+1]):
                index+=1
            dfs(index+1,curr,total)

        dfs(0,[],0)
        return res