class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeDuplicates(int[] arr) {
        if(arr.length==0) return 0;
        int counter = 0;
        int i = 0;
        for(i =0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                counter++;
            }else{
                swap(arr,i,i-counter);
            }
        }
        swap(arr,i,i-counter);
        return arr.length - counter;
    }
}