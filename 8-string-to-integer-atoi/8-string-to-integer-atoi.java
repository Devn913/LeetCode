class Solution {
    public int myAtoi(String s) {
        boolean neg = false;
        int len = s.length();
        
        int res = 0;
        int index = 0;
        while(index<len && s.charAt(index)==' ') ++index;
        if(index<len && s.charAt(index)=='-'){
            neg = true;
            ++index;
        }else if(index<len && s.charAt(index)=='+') ++index;
        while(index<len){
            char ch = s.charAt(index);
            if(!Character.isDigit(ch)) break;
            int digit = ch - '0';
            if ((res > Integer.MAX_VALUE / 10) || 
                (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {     
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                return !neg ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res*10 + digit;
            ++index;
            
        }
        return neg ? -res : res;
    }
                    
}