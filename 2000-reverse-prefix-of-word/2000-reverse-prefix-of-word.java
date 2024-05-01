class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word.length());
        int found = 0;
        for(int i =0;i<word.length();i++){
            sb.append(word.charAt(i));
            if(found == 0 && word.charAt(i) == ch){
                sb.reverse();
                found = 1;
            }
        }
        return sb.toString();
        

    }
}