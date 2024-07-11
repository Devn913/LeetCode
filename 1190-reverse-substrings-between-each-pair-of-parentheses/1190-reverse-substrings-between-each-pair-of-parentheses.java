class Solution {
    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start++, sb.charAt(end));
            sb.setCharAt(end--, temp);
        }
    }
    public String reverseParentheses(String s) {
        Stack<Integer> openParenthesesIndices = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char currentChar : s.toCharArray()) {
            if (currentChar == '(') {
                openParenthesesIndices.push(result.length());
            } else if (currentChar == ')') {
                int start = openParenthesesIndices.pop();
                reverse(result, start, result.length() - 1);
            } else {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}