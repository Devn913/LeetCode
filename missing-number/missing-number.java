class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num: nums){
            sum +=num;
        }
        return (n+1)*(n)/2 - sum;
    }
}
