class Solution {
    int count(String s){
        int counter = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='1') counter++;
        }
        return counter;
    }
    public int numberOfBeams(String[] bank) {
        int res = 0;
        int prev = 0;
        for(int i = 0;i<bank.length;i++){
            int current = count(bank[i]);
            if(current == 0) continue;
            res+=(prev*current);
            prev = current;
        }
        return res;
    }
}