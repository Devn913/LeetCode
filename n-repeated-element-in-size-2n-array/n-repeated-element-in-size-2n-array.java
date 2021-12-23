class Solution {
    public int repeatedNTimes(int[] arr) {
        
        for(int i=2;i<arr.length;i++){
            if( (arr[i]^arr[i-1])==0 || (arr[i]^arr[i-2])==0 ) {
                return arr[i];
            }
        }
        return arr[0];
    }
}