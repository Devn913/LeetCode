class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int index1      = 0;
        int subIndex1   = 0;
        int index2      = 0;
        int subIndex2   = 0;
        while(index1!= word1.length && index2!=word2.length){
            if(subIndex1 == word1[index1].length()){
                subIndex1 = 0;
                index1++;
                continue;
            }
            if(subIndex2 == word2[index2].length()){
                subIndex2 = 0;
                index2++;
                continue;
            }
            if(word1[index1].charAt(subIndex1) != word2[index2].charAt(subIndex2)){
                return false;
            }
            subIndex1++;
            subIndex2++;
        }
        while(index1!=word1.length){
            if(subIndex1==word1[index1].length()){
                subIndex1 = 0;
                index1++;
                continue;
            }
            return false;
        }
        while(index2!=word2.length){
            if(subIndex2==word2[index2].length()){
                subIndex2= 0 ;
                index2++;
                continue;
            }
            return false;
        }
        return true;
        
    }
}