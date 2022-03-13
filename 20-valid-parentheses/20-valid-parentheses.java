class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '('){
                s1.push(')');
            }else if(c == '{'){
                s1.push('}');
            }else if( c=='['){
                s1.push(']');
            }
            else if(!(s1.isEmpty()) && s1.peek()==c){
                s1.pop();
            }else{
                return false;
            }
        }
        return s1.isEmpty();
    }
}