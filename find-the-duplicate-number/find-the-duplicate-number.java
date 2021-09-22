class Solution {
    public int findDuplicate(int[] arr) {
        int index =0;;
        for(int i = 0;i<arr.length;i++){
            index = Math.abs(arr[i]);
            if(arr[index]<0) break;
            arr[index] = -arr[index];
        }
        return index;
    }
}