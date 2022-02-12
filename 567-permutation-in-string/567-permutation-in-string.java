class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int[] freq = new int[26];
        int[] second = new int[26];
        for(int i =0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
            second[s2.charAt(i)-'a']++;
            
        }
        int i = 0;
        int j = s1.length();
        while(j<s2.length()){
            if(equals(freq,second)) return true;
            second[s2.charAt(j) - 'a']++;
            second[s2.charAt(i) - 'a']--;
            i++;
            j++;            
        }
        return equals(freq,second);
        
    }
    public boolean equals(int[] first, int[] second) {
        for (int i = 0; i < 26; i++) {
            if (first[i] != second[i])
                return false;
        }
        return true;
    }
}