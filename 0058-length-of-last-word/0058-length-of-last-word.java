class Solution {
    public int lengthOfLastWord(String s) {
        int index = s.length()-1;
        int size = 0;
        for(int i = s.length()-1;i!=-1;i--){
            if(s.charAt(i)==' '){
                if(size!=0) return size;
                continue;
            }
            size++;
        }
        return size;
    }
}