class Solution {

    public int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;
        int N = arr.length;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<arr[0]){
                if(arr[mid]<=target && target<=arr[N-1]){
                    low = mid+1;
                }else{
                    high = mid - 1;
                }
            }else{
                if(arr[0]<=target && target<=arr[mid]){
                    high = mid -1;
                }else{
                    low = mid+1;
                }
            }
        }
        return -1;
    }
}