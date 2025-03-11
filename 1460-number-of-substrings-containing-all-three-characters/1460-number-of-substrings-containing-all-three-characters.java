class Solution {
    public int numberOfSubstrings(String s) {
        int[] freq = {0,0,0};
        int start  = 0;
        int end = 0;
        int N = s.length();
        int answer = 0;
        freq[s.charAt(start)-'a']++;
        while(end<N){
            if(freq[0] > 0 && freq[1] > 0 && freq[2] > 0){
                answer+=(N - end);
                freq[s.charAt(start)-'a']--;
                start++;
            }else if(end<N-1){
                end++;
                freq[s.charAt(end)-'a']++;
            }else if(start<N){
                freq[s.charAt(start)-'a']--;
                start++;
            }else break;
        }
        return answer;
    }
}