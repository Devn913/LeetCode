class Solution {
    public boolean equals(int[] freq, int[] currFreq){
        for(int i = 0;i<freq.length;i++){
            if(freq[i]>currFreq[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        int[] freqT = new int[256];
        for(int i = 0;i<t.length();i++){
            freqT[(int) t.charAt(i)]++;
        }
        int[] freqCurrentWindow = new int[256];
        int currentStart = 0;
        int currentEnd   = Integer.MAX_VALUE;
        int start = 0;
        int end   = 0;
        freqCurrentWindow[s.charAt(start)]++;
        while(end<s.length()){
            if(equals(freqT,freqCurrentWindow)){
                if(currentEnd - currentStart>end-start){
                    currentEnd = end;
                    currentStart = start;
                }
                if(start<s.length()){
                    freqCurrentWindow[(int) s.charAt(start)]--;
                    start++;
                }else break;
               
            }else if(end<s.length()-1){
                end++;
                freqCurrentWindow[(int) s.charAt(end)]++;
            }else break;
        }
        if(currentEnd == Integer.MAX_VALUE ) return "";
        return s.substring(currentStart,currentEnd+1);

    }
}