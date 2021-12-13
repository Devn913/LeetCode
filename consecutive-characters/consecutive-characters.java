class Solution {
    public int maxPower(String s) {
        int max = 1;
        int current = 0;
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                current++;
            }else{
                if(current>=max) max = current+1;
                current = 0;
            }
        }
        if(current>=max) max = current+1;
        return max;
    }
}