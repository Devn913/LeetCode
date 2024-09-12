class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] map = new int[26];
        int ans = 0;
        for(int i = 0; i < allowed.length();i++){
           int index = (int) (allowed.charAt(i) - 'a');
            map[index]++;
        }
        for(int i =0;i<words.length;i++){
            boolean found = true;
            for(int j =0;j<words[i].length();j++){
                int index = (int)(words[i].charAt(j) - 'a');
                if(map[index]==0){
                    found = false;
                    break;
                }
            }
            if(found) ans++;
        }
        return ans;
    }
}