class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String t: tokens){
            if(t.equals("+")){
                s.push(s.pop() + s.pop());
            }else if(t.equals("-")){
                int first = s.pop();
                s.push(s.pop() - first);                
            }else if(t.equals("/")){
                int first = s.pop();
                s.push(s.pop()/first);
            }else if(t.equals("*")){
                s.push(s.pop() * s.pop());
                
            }else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
        
    }
}