class Solution:
    def sortVowels(self, s: str) -> str:
        vowel = ['A','E','I','O','U','a','e','i','o','u']
        myV = []
        for char in s:
            if(char in vowel):
                myV.append(char)
        myV = sorted(myV)
        ans = "" 
        for char in s:
            if(char in vowel):
                ans = ans+myV.pop(0)
            else:
                ans = ans+char
        return ans            