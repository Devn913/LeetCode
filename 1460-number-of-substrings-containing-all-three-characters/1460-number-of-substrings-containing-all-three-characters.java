class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = {0,0,0};
        int start = 0;
        int end = 0;
        int ans = 0;
        freq[s.charAt(end) - 'a']++;
        while(end<s.length()){
            if(freq[0] !=0 && freq[1] != 0 && freq[2] !=0){
                ans+=(s.length() - end);
                freq[s.charAt(start)-'a']--;
                start++;
            }else if(end<s.length()-1){
                end++;
                freq[s.charAt(end)-'a']++;
            }else if(start<s.length()){
                freq[s.charAt(start)-'a']--;
                start++;
            }else break;

            

        }
        return ans;
    }
}