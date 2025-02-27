class Solution {
    public int setKBit(int num, int k){ // Setting the k-bit to 1 in the number num
        return (1<<k) | num;
    }
    public int checkKBit(int num, int k){ // checking if kth bit is already one if yes return 0
        return (1<<k) & num;
    }
    public char repeatedCharacter(String s) {
        int value = 0;
        for(char c: s.toCharArray()){
            int k = c - 'a';
            if(checkKBit(value,k)!=0) return c;
            value = setKBit(value,k);
        }
        return '1';
    }
}