class Solution {   
        
    public int minPairSum(int[] arr) {
        Arrays.sort(arr);
        int result = 0;
        int min = 0;
        int max = arr.length-1;
        while(min<=max){
            if(result<arr[min] + arr[max]){
                result = arr[min] + arr[max];
            }
            min++;
            max--;
        }
        return result;
        
    }
}
