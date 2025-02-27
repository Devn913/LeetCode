class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] freq = new boolean[256];
        int start = 0;
        int end = 0;
        int max = 0;
        while(end<s.length()){
            if(freq[(int) s.charAt(end)]){
                freq[(int) s.charAt(start)] = false;
                start++;
            }
            else{
                freq[(int) s.charAt(end)] = true;
                end++; 
            }
            max = Math.max(max,end-start);
        }
        return max;
    }
}