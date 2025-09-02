class Solution:
    def partition(self, s: str) -> List[List[str]]:
        res = []
        curr_part = []

        def helper(s):
            if not s:
                res.append(curr_part[:])
                return
            for i in range(len(s)):
                temp = s[0:i+1]
                if(temp == temp[::-1]):

                    curr_part.append(temp)
                    helper(s[i+1:])
                    curr_part.pop()
        helper(s)
        return res