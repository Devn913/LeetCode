class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else if(!stack.isEmpty() && stack.peek() == c ){
                stack.pop();
            }else{
                return false;
            }
        }

        return stack.isEmpty();
    }
}