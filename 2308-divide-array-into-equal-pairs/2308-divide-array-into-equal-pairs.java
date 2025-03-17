class Solution {
    public boolean divideArray(int[] arr) {
      Arrays.sort(arr);
      for(int i = 0;i<arr.length;i+=2){
        if(arr[i]!=arr[i+1]) return false;
      }  
      return true;
    }
}