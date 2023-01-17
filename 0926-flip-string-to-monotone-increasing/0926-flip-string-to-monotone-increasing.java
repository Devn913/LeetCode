class Solution {
    public int countZero(String s){
        int ans = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0') ans++;
        }
        return ans;
    }
    public int minFlipsMonoIncr(String s) {
        int zeros = countZero(s);
        int ones = s.length() - zeros;
        int ans = Math.min(zeros,ones);
        int now = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '1') now++;
            int curr = now+ (s.length()-i-1)-(ones-now);
            ans = Math.min(ans,curr);
        }
        return ans;
    }
}