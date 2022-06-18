class Solution {
    public int[] replaceElements(int[] arr) {
        int greatest = -1;
        int counter = arr.length - 1;
        while(counter>=0){
            int temp = arr[counter];
            arr[counter] = greatest;
            greatest = Math.max(greatest,temp);
            counter--;
        }
        return arr;
        
    }
}