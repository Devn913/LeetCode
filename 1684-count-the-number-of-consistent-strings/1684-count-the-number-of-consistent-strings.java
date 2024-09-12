class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] map = new int[26];
        for(int i = 0; i < allowed.length();i++){
            map[(int) (allowed.charAt(i) - 'a')]++;
        }
        int ans = 0;
        for(int i =0;i<words.length;i++){
            boolean found = true;
            for(int j =0;j<words[i].length();j++){
                if(map[(int) (words[i].charAt(j) - 'a')]==0){
                    found = false;
                    break;
                }
            }
            if(found) ans++;
        }
        return ans;
    }
}