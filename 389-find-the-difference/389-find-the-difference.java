class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq = new int[26];
        freq[t.charAt(0)-'a']++;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']--;
            freq[t.charAt(i+1) - 'a']++;
        }
        for(int i = 0;i<26;i++){
            if(freq[i] == 1) return (char)(i+'a');
        }
        return 'a';
        
    }
}