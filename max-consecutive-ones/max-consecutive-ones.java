class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int result = 0;
        int intermediate = 0;
        for(int i = 0;i<arr.length;i++){

            if(arr[i] == 1){
                intermediate++;
            }
            if(arr[i] != 1){
                if(result<intermediate) result = intermediate;
                intermediate = 0;
            }
        }
        return result>intermediate ? result : intermediate ;
    }
}