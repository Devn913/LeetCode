class Solution {
    public void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int len =nums.length;
        k = k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
}