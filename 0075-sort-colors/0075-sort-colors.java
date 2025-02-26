class Solution {
    public void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }
}