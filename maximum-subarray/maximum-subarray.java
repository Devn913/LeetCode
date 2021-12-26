class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for(int num: nums){
            maxEndingHere+=num;
            if(maxEndingHere<num) maxEndingHere = num;
            if(maxSoFar<maxEndingHere) maxSoFar = maxEndingHere;
        }
        return maxSoFar;
    }
}