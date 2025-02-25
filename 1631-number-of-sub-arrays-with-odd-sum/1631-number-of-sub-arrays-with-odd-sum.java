class Solution {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int evenCount = 1;
        int oddCount  = 0;
        long prefixSum = 0;
        for(int i = 0;i<arr.length;i++){
            prefixSum+=arr[i];
            if(prefixSum % 2 == 0){
                count+=(oddCount);
                
                evenCount++;
            }else{
                count+=(evenCount);
                oddCount++;
            }
            count = count % 1000000007;
        }
        return count;

    }
}