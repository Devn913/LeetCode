class Solution {
        public int kad_max(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i<arr.length;i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum,currSum); 
            if(currSum<0) currSum = 0;
        }
        return maxSum;
    }
    public int kad_min(int[] arr){
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        for(int i = 0;i<arr.length;i++){
            currSum += arr[i];
            minSum = Math.min(minSum,currSum); 
            if(currSum>0) currSum = 0;
        }
        return minSum;
    }
    public int maxSubarraySumCircular(int[] arr) {
        int totalSum = 0;
        for(int num: arr){
            totalSum+=num;
        }
        int minSum = kad_min(arr);
        int maxSum = kad_max(arr);
        System.out.println(minSum);
        System.out.println(maxSum);
        System.out.println(totalSum);
        if(totalSum==minSum) return maxSum;
        return Math.max(totalSum-minSum,maxSum);
    }
}