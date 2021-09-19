class Solution {   
    public int maxProductDifference(int[] arr) {
        int i = 0;
        int j = -1;
        int k = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        int counter = 0;
        while(counter<arr.length){
            if(arr[counter]>= i){
                j = i;
                i = arr[counter];
            }else if(arr[counter]>j){
                j = arr[counter];
            }
            
            if(arr[counter]<=k){
                l = k;
                k = arr[counter];
            }else if(arr[counter]<l){
                l = arr[counter];
            }
            
            counter++;
        }
        return i*j - k*l;
    }
}