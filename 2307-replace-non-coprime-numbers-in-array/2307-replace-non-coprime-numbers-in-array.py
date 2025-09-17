class Solution:
    def replaceNonCoprimes(self, nums: List[int]) -> List[int]:
        ans = []
        for num in nums:
            # keep merging while last element and current num are not coprime
            while ans and math.gcd(ans[-1], num) > 1:
                num = (ans[-1] * num) // math.gcd(ans[-1], num)
                ans.pop()
            ans.append(num)
        return ans