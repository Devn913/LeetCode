class Solution {
    public String reverseWords(String s) {
        int i = s.length() -1;
        StringBuilder res = new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            int j = i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(res.length() == 0)
                res.append(s.substring(i+1,j+1));
            else
                res.append(" " + s.substring(i+1,j+1));
        }
        
        return res.toString();
        
    }
}