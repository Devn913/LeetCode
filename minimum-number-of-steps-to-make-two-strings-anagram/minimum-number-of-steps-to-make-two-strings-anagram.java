class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for(int i=0;i<s.length();i++){
            arr[((int) s.charAt(i)) - 97]++;
            arr[((int) t.charAt(i)) - 97]--;
        }
        int counter = 0;
        boolean divideBy2 = false;
        for(int num: arr){
            if(num<0) {
                counter-=num;
                divideBy2 = true;
            }
            else counter+=num;
            
        }
        
        return divideBy2 ? counter/2: counter;
    }
}