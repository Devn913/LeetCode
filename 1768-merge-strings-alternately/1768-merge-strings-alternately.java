class Solution {
    public String mergeAlternately(String word1, String word2) {
        if(word1.length()==0) return word2;
        if(word2.length()==0) return word1;
        int pointer1 = 0;
        int pointer2 = 0;
        StringBuilder sb = new StringBuilder(word1.length()+word2.length());
        while(pointer1!=word1.length() || pointer2!=word2.length() ){
            if(pointer1==word1.length()){
                sb.append(word2.charAt(pointer2++));
                continue;
            }
            if(pointer2==word2.length()){
                sb.append(word1.charAt(pointer1++));
                continue;
            }
            sb.append(word1.charAt(pointer1++));
            sb.append(word2.charAt(pointer2++));
        }
        return sb.toString();
        
    }
}