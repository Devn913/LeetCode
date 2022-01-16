class Solution {
    public String[] divideString(String s, int k, char fill) {
        int len = s.length();
        int size = len/k;
        if(len%k != 0) size++; 
        String[] res = new String[size];
        int start = 0;
        int end = k;
        for(int i = 0;start<len;i++){
            res[i] =  s.substring(start,Math.min(end,len));
            while(res[i].length()!=k){
                res[i]+=fill;
            }
            start+=k;
            end+=k;

        }
        return res;
    }
}