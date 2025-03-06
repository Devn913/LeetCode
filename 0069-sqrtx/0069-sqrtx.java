class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = low + ((high-low) / 2);
        while (low <= high) {
            long mid = low + ((high-low) / 2);
            if (mid * mid > x) {
                high = (int) mid - 1;
            } else {
                ans = (int) mid;
                low = (int) mid + 1;
            }
        }
        return ans;
    }
}