class Solution {
    public boolean isConsistent(String word, int[] map){
        int[] map2 = new int[26];
        for(int i = 0;i<word.length();i++){
           int index = (int) (word.charAt(i) - 'a');
            map2[index]++;
        }
        for(int i =0;i<26;i++){
            if(map[i]==0 && map2[i]!=0) return false;
        }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        int[] map = new int[26];
        int ans = 0;
        for(int i = 0; i < allowed.length();i++){
           int index = (int) (allowed.charAt(i) - 'a');
            map[index]++;
        }
        for(int i =0;i<words.length;i++){
            if(isConsistent(words[i],map)){
                ans++;
            }
        }
        return ans;
    }
}