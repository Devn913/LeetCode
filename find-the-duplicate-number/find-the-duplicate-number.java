class Solution {
    public int findDuplicate(int[] arr) {
        int index=0;
       for(int i = 0;i<arr.length;i++){
            index  = Math.abs(arr[i]) - 1;
            if(arr[index]<0) break;
            arr[index] = -arr[index];
        }
        return index+1;
    }
}