class Solution {
    public int maximumGain(String s, int x, int y) {
        char firstChar = 'a';
        char secondChar = 'b';
        if(y>x){
            firstChar  = 'b';
            secondChar = 'a';
        }
        StringBuilder sb =  remove(s,firstChar,secondChar);
        int ans = (s.length() - sb.length())*Math.max(x,y)/2;
        StringBuilder sb2 = remove(sb.toString(),secondChar,firstChar);
        ans+= (sb.length() - sb2.length())*Math.min(x,y)/2;
        return ans;
        
    }
    public StringBuilder remove(String s, char firstChar, char secondChar){
        StringBuilder result = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == secondChar){
                if(result.length()>0 && result.charAt(result.length()-1) == firstChar){
                    result.deleteCharAt(result.length() - 1);
                    continue;
                }
            }
            result.append(s.charAt(i));
        }
        return result;
        
    }
}