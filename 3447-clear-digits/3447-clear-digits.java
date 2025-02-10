class Solution {
    public String clearDigits(String s) {
        StringBuilder answer = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) && answer.length()!=0){
                answer.setLength(answer.length()-1);
            }else{
                answer.append(c);
            }
        }
        return answer.toString();
    }
}