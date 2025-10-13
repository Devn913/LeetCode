class Solution:
    # def flip(self,s, index):
    #     for i in range(index,len(s)):
    #         if(s[i] == 0):
    #             s[i] = 1
    #         else:
    #             s[i] = 0
    #     return s
    def minFlips(self, target: str) -> int:
        ans = 0
        n = len(target)
        # s = [0]*n
        bit = 0
        for i in range(n):
            if(int(target[i]) != bit):
                ans+=1
                # bit = (bit +1)%2
                if(bit == 0):
                    bit = 1
                else:
                    bit = 0
        return ans
