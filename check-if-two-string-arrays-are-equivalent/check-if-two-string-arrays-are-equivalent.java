class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstWord = "";
        String secondWord = "";
        int counter1 = 0;
        int counter2 = 0;
        while(counter1<word1.length || counter2< word2.length){
            if(counter1<word1.length){
                firstWord = firstWord + word1[counter1];
                counter1++;
            }
            if(counter2 < word2.length){
                secondWord = secondWord + word2[counter2];
                counter2++;
            }

            
        }
        return firstWord.equals(secondWord);
    }
}