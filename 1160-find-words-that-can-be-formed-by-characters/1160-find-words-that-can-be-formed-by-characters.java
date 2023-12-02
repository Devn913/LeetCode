class Solution {
    public int checkWord(int[] arr, String s){
        int[] tempArray = new int[26];
        for(int i = 0;i<s.length();i++){
            int index = (int) (s.charAt(i)-'a');
            tempArray[index]++;
            if(tempArray[index]>arr[index]) return -1;
        }
        return s.length();
        
    }
    public int countCharacters(String[] words, String chars) {
        int[] arr = new int[26];
        int ans = 0;
        for(int i = 0;i<chars.length();i++){
            arr[(int) (chars.charAt(i)-'a')]++;
        }
        for(int i = 0;i<words.length;i++){
            int val = checkWord(arr,words[i]);
            if(val>0){
                ans+=val;
            }
        }
        return ans;
    }
}