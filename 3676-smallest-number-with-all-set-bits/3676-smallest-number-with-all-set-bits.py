class Solution:
    def smallestNumber(self, x: int) -> int:
        ans = 1
        while x!=0:
            ans = ans << 1
            x = x>>1
        return ans - 1