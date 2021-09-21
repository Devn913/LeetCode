class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int result = 0;
        short intermediate = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 1){
                intermediate++;
            }else{
                if(result<intermediate) result = intermediate;
                intermediate = 0;
            }
        }
        return Math.max(result,intermediate);
    }
}
