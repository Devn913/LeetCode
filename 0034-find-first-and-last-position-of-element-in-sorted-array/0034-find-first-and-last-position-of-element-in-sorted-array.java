class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] result = {-1,-1};
        int low = 0;
        int high = arr.length - 1;
        boolean found = false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                result[0] = mid;
                found = true;
                high = mid -1;
            }else if(arr[mid]>target){
                high = mid -1;
            }else {
                low = mid+1;
            }
        }
        if(!found) return result;

        low = 0;
        high = arr.length - 1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                result[1] = mid;
                low = mid + 1;
            }else if(arr[mid]>target){
                high = mid -1;
            }else{
                low = mid+1;         
            }
        }
        return result;
        
    }
}