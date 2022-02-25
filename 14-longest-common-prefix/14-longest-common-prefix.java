class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String prefix = strs[0];
        for(int i = 1;i<strs.length;i++){
            int j = 0;
            for(;j<strs[i].length() && j<prefix.length() ;j++){
               if(prefix.charAt(j) != strs[i].charAt(j)){
                   prefix = prefix.substring(0,j);
                   break;
               } 
            }
            prefix = prefix.substring(0,j);
            if(prefix.length() == 0) return "";
        }
        return prefix;
    }
}