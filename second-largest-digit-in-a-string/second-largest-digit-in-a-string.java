class Solution {
    public int secondHighest(String s) {
        int firstLargest = -1;
        int secondLargest = -1;
        for(int i = 0;i<s.length();i++){
            int result = 0;
            if(s.charAt(i) > 47 && s.charAt(i)<58){
                result = s.charAt(i) - 48;  
                if(result>firstLargest){
                    secondLargest = firstLargest;
                    firstLargest = result;
                }else if(result>secondLargest && result<firstLargest){
                    secondLargest = result;
                }
            }
        }
        if(firstLargest == secondLargest){
            return -1 ;
        }
        return secondLargest;
    }
}