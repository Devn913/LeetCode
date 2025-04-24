class Solution {
    public boolean isValid(int[] freq, int len, int k){
        int maxFreq = 0;
        for(int i = 0;i<freq.length;i++){
            maxFreq = Math.max(maxFreq,freq[i]);
        }
        return len - maxFreq<=k;
    }
    public int characterReplacement(String s, int k) {
        int start,end;
        int[] freq = new int[26];
        int ans = Integer.MIN_VALUE;
        for(start=0,end=0;end<s.length();end++){
            freq[(int) (s.charAt(end) - 'A')]++;
            while(start<s.length() && !isValid(freq,end-start+1,k)){
                freq[(int) (s.charAt(start) - 'A')]--;
                start++;
            }
            ans = Math.max(ans,end-start+1);
        }
        return ans;

    }
}