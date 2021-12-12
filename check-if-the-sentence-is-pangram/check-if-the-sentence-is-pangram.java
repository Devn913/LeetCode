class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];
        for(int i= 0;i<sentence.length();i++){
            char c = sentence.charAt(i);
            arr[((int)c)-97] = true;
        }
        for(boolean b: arr){
            if(!b) return b;
        }
        return true;
    }
}