class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length()) return false;
        if(s.length()==0) return true;
        int current = 0;
        int tIndex  = 0;
        while(tIndex<t.length()){
            if(current==s.length()) break;
            if(s.charAt(current)==t.charAt(tIndex)){
                current++;
                tIndex++;
                continue;
            }
            tIndex++;
        }
        return current==s.length();
    }
}