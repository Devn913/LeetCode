class Solution {
    public int findMin(int[] arr) {
        if (arr.length == 1) return arr[0];
        int left = 0;
        int right = arr.length-1;
        if(arr[left]<arr[right]) return arr[0];
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]>arr[mid+1]){
                return arr[mid+1];
            }else if(arr[mid]<arr[mid-1]){
                return arr[mid];
            }else if(arr[left]<arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}