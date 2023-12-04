class Solution {
    public int getAnswer(char a){
        int num = (int) (a - '0');
        return num*100 + num*10 + num;
    }
    public String largestGoodInteger(String num) {
        int i =0;
        int ans = -1;
        while(i+2<num.length()){
            if(num.charAt(i) == num.charAt(i+1) && num.charAt(i+1) == num.charAt(i+2)){
                ans = Math.max(ans,getAnswer(num.charAt(i)));
                i = i+2;
                
            }else i++;
        }
        if(ans == -1) return "";
        else if(ans == 0) return "000";
        return Integer.toString(ans);
    }
}