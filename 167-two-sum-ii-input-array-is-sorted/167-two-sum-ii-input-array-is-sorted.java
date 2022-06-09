class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {-1,-1};
        for(int i = 0;i<numbers.length;i++){
            int res = binarySearch(numbers,i+1,numbers.length-1,target-numbers[i]);
            if(res!=-1){
                result[0] = i+1;
                result[1] = res+1;
                break;
            }
        }
        return result;
    }
    public int binarySearch(int[] arr, int low, int high, int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid]>target) high = mid -1;
            else low = mid+1;
        }
        return -1;
    }
}