class Solution {
    public int search(int[] arr, int target) {
        if(arr.length  == 0) return arr[0] == target ? 0 : -1;
        int ans = 0;
        int left = 0;
        int right = arr.length-1;
        if(arr[left]<arr[right]) ans = 0;
        else{
            while(left<right){
                int mid = (left+right)/2;
                if(arr[mid]>arr[mid+1]){
                    ans = mid+1;
                    break;
                }else if(arr[mid]<arr[mid-1]){
                    ans = mid;
                    break;
                }else if(arr[left]<arr[mid]){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        int low = 0;
        int high = ans - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid -1;
            else if(arr[mid]<target) low = mid+1;
            else return mid;
        }
        low = ans;
        high = arr.length - 1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > target) high = mid -1;
            else if(arr[mid]<target) low = mid+1;
            else return mid;
        }
            
        return -1;
    }
}