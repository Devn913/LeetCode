class Solution:
    def partition(self, s: str) -> List[List[str]]:

        ans = []
        def helper(s,part):
            if not s:
                ans.append(part[:])
                return
            
            for i in range(len(s)):
                temp = s[:i+1]
                if(temp == temp[::-1]):
                    part.append(temp)
                    helper(s[i+1:],part)
                    part.pop()
        helper(s,[])
        return ans