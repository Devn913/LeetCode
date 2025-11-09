class Solution:
    def countOperations(self, num1: int, num2: int) -> int:
        if(num1==0 or num2 == 0):
            return 0

        ans = 0
        while(num1!=0 or num2!=0):
            
            if(num1==num2):
                return 1 + ans
            elif(num1>num2):
                num1 = num1-num2
            else:
                num2 = num2-num1
            ans+=1
        return ans
        