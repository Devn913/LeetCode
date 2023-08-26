class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder(strs[0]);
        // sb = strs[0];
        for(int i = 1;i<strs.length;i++){
            String curr = strs[i];
            
            if(curr.length()<sb.length()){
                sb.setLength(curr.length());
            }
            for(int j = 0;j<Math.min(sb.length(),curr.length());j++){
                if(curr.charAt(j)!=sb.charAt(j)){
                    sb.setLength(j);
                    break;
                }
            }
            
        }
        return sb.toString();
    }
}