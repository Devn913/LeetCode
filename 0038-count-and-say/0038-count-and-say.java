class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        String lastNum = countAndSay(n-1);
        int index = 0;
        StringBuilder sb = new StringBuilder();
        while(index<lastNum.length()){
            char currElement = lastNum.charAt(index++);
            int freq = 1;
            while(index<lastNum.length()){
                if(lastNum.charAt(index) != currElement) break;
                index++;
                freq++;
            }
            sb.append(Integer.toString(freq));
            sb.append(currElement);
        }
        return sb.toString(); 
    }
}