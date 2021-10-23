class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        int counter = -1;
        for(int i =0; i<s.length();i++){
            if(counter!=-1 && res.charAt(counter) == s.charAt(i)){
                res.deleteCharAt(counter);
                 counter--;
            }else{
                res.append(s.charAt(i));
                counter++;
            }
        }
        return res.toString();
        
    }
}