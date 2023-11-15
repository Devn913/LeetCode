class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if(arr.length==1) return 1;
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i = 1;i<arr.length-1;i++){
            if(Math.abs(arr[i]-arr[i-1])<=1 && Math.abs(arr[i]-arr[i+1])<=1){
                i=i+2;
            }else if(Math.abs(arr[i]-arr[i-1])<=1){
                continue;
            }else{
                arr[i] = arr[i-1]+1;
            }
        }
        if(Math.abs(arr[arr.length-1]-arr[arr.length-2])>1){
            arr[arr.length-1] = arr[arr.length-2]+1;
        }
        return arr[arr.length-1];
    }
}