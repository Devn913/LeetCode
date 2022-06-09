class Solution {
    public int[] twoSum(int[] arr,int target) {
        int[] result = {-1,-1};
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                result[0] = low+1;
                result[1] = high+1;
                break;
            }else if(arr[low]+arr[high]>target){
                high--;
            }else{
                low++;
            }
        }
        return result;
    }
}