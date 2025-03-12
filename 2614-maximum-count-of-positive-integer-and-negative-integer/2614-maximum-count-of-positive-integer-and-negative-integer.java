class Solution {
    public int lowerBound(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int index = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<0){
                low = mid+1;
            }else{
                index = mid;
                high = mid-1;
            }
        }
        return index;
    }
    public int upperBound(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        int index = arr.length;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]<=0){
                low = mid+1;
            }else{
                index = mid;
                high = mid-1;
            }
        }
        return index;
    }
    public int maximumCount(int[] nums) {
        int positiveCount = nums.length - upperBound(nums);
        // All integers from the index 0 to index before the first zero index
        // will be negative.
        int negativeCount = lowerBound(nums);

        return Math.max(positiveCount, negativeCount);
    }
}