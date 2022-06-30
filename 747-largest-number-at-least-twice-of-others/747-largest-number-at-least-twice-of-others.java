class Solution {
    public int dominantIndex(int[] arr) {
        int largest = 0;
        int secondLargest = -1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                secondLargest = arr[largest];
                largest = i;
                continue;
            }else if(arr[i]>secondLargest){
                secondLargest = arr[i];
            }
        }
        if(arr[largest]>=2*secondLargest) return largest;
        return -1;
    }
}