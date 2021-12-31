class Solution {
    public int[] searchRange(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int[] res = {-1,-1};
        
        int mid = (low+high)/2;
        while(low<=high){
            if(arr[mid] == target){
                res[0] = mid;
                high = mid -1;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else if(arr[mid]<target){
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        if(res[0]==-1) return res;
        low = 0;
        high = arr.length -1;
        while(low<=high){
            if(arr[mid] == target){
                res[1] = mid;
                low = mid +1;
            }else if(arr[mid] > target){
                high = mid - 1;
            }else if(arr[mid]<target){
                low = mid+1;
            }
            mid = (low+high)/2;
        }
        return res;
        
    }
}