class Solution {
    public int maxAbsoluteSum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currMaxSum = 0;
        int minSum = Integer.MAX_VALUE;
        int currMinSum = 0;

        for(int num: arr){
            currMaxSum+=num;
            currMinSum+=num;
            maxSum = Math.max(maxSum,currMaxSum);
            minSum = Math.min(minSum,currMinSum);
            if(currMinSum>0) currMinSum= 0;
            if(currMaxSum<0) currMaxSum= 0;

        }
        return Math.max(maxSum,Math.abs(minSum));
    }
}