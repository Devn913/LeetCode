class Solution {
    public int findMin(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        int low = 0;
        int high = arr.length -1;
        int mid = (low+high)/2;
        int ans = Integer.MAX_VALUE;
        while(low<high){
            mid = (low+high)/2;
            ans = Math.min(Math.min(ans,arr[low]),Math.min(arr[high],arr[mid]));
            if(arr[mid]>arr[low] && arr[mid]>arr[high]){
                low = mid+1;
            }else if(arr[low]>arr[high] || arr[high]>arr[mid]){
                high = mid-1;
            }
            else{
                return ans;
            }
        }
        return ans;
    }
}