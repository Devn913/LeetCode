class Solution {
    public boolean isValid(int[] freq, int k, int len){
        int maxFreq = freq[0];
        for(int i = 1;i<26;i++) maxFreq = Math.max(maxFreq,freq[i]);

        return  len - maxFreq <= k;
    }
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l,r;
        int ans = Integer.MIN_VALUE;
        for(l=0,r=0;r<s.length();r++){
            freq[(int) (s.charAt(r)-'A')]++;
            
            while(l<=r && !isValid(freq,k,r-l+1)){
                freq[(int) (s.charAt(l)-'A')]--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}