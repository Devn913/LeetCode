class Solution {
    public String truncateSentence(String s, int k) {
        int i =0;
        for(i=0;i<s.length() && k!=0;i++){
            if(s.charAt(i)==' ') --k;
        }
        return k==0 ? s.substring(0,i-1) : s.substring(0,i);
    }
}