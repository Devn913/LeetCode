class Solution {
    private void rightShift(int[] arr, int startIndex){
        int endIndex = arr.length - 2;
        while(endIndex>=startIndex){
            swap(arr,endIndex,endIndex +1);
            endIndex--;
        }
    }
    private void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void duplicateZeros(int[] arr) {
        for(int i = 0 ;i<arr.length-1;i++){
            if(arr[i] == 0){
                rightShift(arr,i+1);
                arr[i+1] = 0;
                i++;
            }
        }
    }
}