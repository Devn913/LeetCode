class Solution {
    public String minRemoveToMakeValid(String string) {
        Stack<Integer> s = new Stack<>();
        // s.add(-1);
        for(int i = 0;i<string.length();i++){
            if(string.charAt(i) != ')' && string.charAt(i) !='(') continue;
            if(string.charAt(i) == ')' && s.size()!=0 && string.charAt(s.peek()) == '('){
                s.pop();
            }else{
                s.push(i);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = string.length()-1;i!=-1;i--){
            if(!s.isEmpty() && s.peek() == i){
                s.pop();
                continue;
            }else{
                sb.append(string.charAt(i));
            } 
        }
        return sb.reverse().toString();
    }
}