class Solution {
    
    public int compress(char[] chars) {
        if(chars.length == 1) return 1;
        int index = 0;
        int internalIndex = 0;
        while(index!=chars.length){
            int count = 0;
            int lastChar = (int) chars[index];
            while(lastChar == ((int) chars[index])){
                count++;
                index++;
                if(index == chars.length) break;
            }
            if(count == 1){
                chars[internalIndex++] = (char) lastChar;
            }
            else{
                String s = String.format("%d",count);
                chars[internalIndex++] = (char) lastChar;
                int tempIndex = 0;
                while(tempIndex!=s.length()){
                    chars[internalIndex++] = s.charAt(tempIndex++);
                }
            }
        }
        return internalIndex;
    }
}