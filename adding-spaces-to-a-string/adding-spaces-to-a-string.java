class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb = new StringBuilder(s.length()+spaces.length);
        int i  = 0;
        int counter = 0;
        while(i<s.length()){
            if(counter<spaces.length && spaces[counter] == i){
                sb.append(" ");
                counter++;
            }else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}