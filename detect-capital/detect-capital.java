class Solution {
    public boolean detectCapitalUse(String word) {
        int noOfCapital = 0;
        boolean first = false;
        
        int counter = 0;
        while(counter<word.length()){
            if(word.charAt(counter) > 64 && word.charAt(counter)<91){
                noOfCapital++;
                if(!first){
                    first = true;
                    if(counter!= 0){
                        return false;
                    }
                }
            }
            counter++;
        }
        if(noOfCapital == word.length() || noOfCapital == 1 || noOfCapital==0){
            return true;
        }
        return false;
        
    }
}