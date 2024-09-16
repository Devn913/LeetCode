class Solution {
    public int longestValidParentheses(String S) {
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        int maxLen = 0;
        for(int i = 0;i<S.length();i++){
            if(S.charAt(i)=='('){
                s.push(i);
            }else{
                s.pop();
                if(s.isEmpty()) s.push(i);
                else maxLen = Math.max(maxLen,i - s.peek());
            }
        }
        return maxLen;
    }
}