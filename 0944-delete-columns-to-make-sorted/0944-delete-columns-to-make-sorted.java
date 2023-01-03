class Solution {
    public int minDeletionSize(String[] strs) {
        // char[][] mat = new char[strs.length][strs.length];
        int ans = 0;
        for(int i = 0; i<strs[0].length();i++){
            char prev = strs[0].charAt(i);
            for(int j = 1;j<strs.length;j++){
                char next = strs[j].charAt(i);
                if(prev<=next){
                    prev = next;
                }else{
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}