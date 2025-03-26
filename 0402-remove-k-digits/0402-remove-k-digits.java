class Solution { 
    public String removeKdigits(String num, int k) {
        if(k ==  num.length()) return "0";
        Stack<Character> s = new Stack<>();
        for(int i = 0;i<num.length();i++){
            while(!s.isEmpty() && k>0 && s.peek() > num.charAt(i) ){
                s.pop();
                k--;
            }
            s.push(num.charAt(i));
        }

        while(!s.isEmpty() && k>0 ){
            s.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();

        for(char ch: s){
            sb.append(ch);
        }
        while(sb.length()>0 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }

        return sb.length() == 0 ? "0" : sb.toString();


    }
}