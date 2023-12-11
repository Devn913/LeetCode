class Solution {
    public int findSpecialInteger(int[] arr) {
        int target = (int) (0.25*arr.length);
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == arr[i+target])
                return arr[i];
        }
        return -1;
    }
}