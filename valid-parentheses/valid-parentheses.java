class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1 = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
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