class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int leftMost = 1;
        int rightMost = 1;
        for(int i=0;i<n;i++){
            left[i] = leftMost * nums[i];
            right[n - i - 1] = rightMost * nums[n - i - 1];
            leftMost = left[i];
            rightMost = right[n - i - 1];
        }
        int[] res = new int[n];
        res[0] = right[1];
        res[n - 1] = left[n - 2];
        for(int i = 1;i<n - 1;i++){
            res[i] = left[i-1] * right[i+1];
        }
        return res;
    }
}