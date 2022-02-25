class Solution {
    public int[] searchRange(int[] arr, int target) {
        int[] res = {-1,-1};
        if(arr.length<1) return res;
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                first = mid;
                high = mid - 1;
            }else if(arr[mid]>target){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        if(first == -1) return res;
        int last = first;
        low = first+1;
        high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                last = mid;
                low = mid+1;
            }
            else if(arr[mid]>target){
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        res[0] = first;
        res[1] = last;
        return res;
    }
}