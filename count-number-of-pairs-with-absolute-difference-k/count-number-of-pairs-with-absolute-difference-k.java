class Solution {
    public int countKDifference(int[] nums, int k) {
        int arr[] = new int[200];
        for(int num: nums) arr[num -1]++;
        int ans = 0;
        for(int i = k ;i<200;i++) ans += arr[i]*arr[i-k];
        return ans;
    }
}