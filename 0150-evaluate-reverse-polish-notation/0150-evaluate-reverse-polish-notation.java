class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        int ans = 0;
        for(int i = 0;i<tokens.length;i++){
            int first,second;
            if(tokens[i].equals("+")){
                first = s.pop();
                second = s.pop();
                s.push(first+second);
            }else if(tokens[i].equals("-")){
                first = s.pop();
                second = s.pop();
                s.push(second-first);
            }else if(tokens[i].equals("*")){
                first = s.pop();
                second = s.pop();
                s.push(second*first);
            }else if(tokens[i].equals("/")){
                first = s.pop();
                second = s.pop();
                s.push(second/first);
            }else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}