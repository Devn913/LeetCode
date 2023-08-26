class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length()) return -1;
        if(needle.length()==haystack.length()) return needle.equals(haystack) ? 0 : -1;
        int curr = 0;
        int size = needle.length();
        int terminalIndex = curr+size;
        while(terminalIndex!=haystack.length()+1){
            if(haystack.substring(curr,terminalIndex).equals(needle)) return curr;
            curr++;
            terminalIndex++;
        }
        return -1;
    }
}