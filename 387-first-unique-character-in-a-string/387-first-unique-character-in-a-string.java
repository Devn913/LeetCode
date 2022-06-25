class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for(int i = 0;i<s.length();i++){
            freq[(int)(s.charAt(i)-'a')]++;
        }
        for(int i = 0;i<s.length();i++){
            if(freq[(int)(s.charAt(i)-'a')] == 1) return i;
        }
        return -1;
    }
}