class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int ans = low + ((high-low) / 2);
        while (low <= high) {
            int mid = low + ((high-low) / 2);
            if ( 1l * mid * mid  > x) {
                high =  mid - 1;
            } else {
                ans =  mid;
                low =  mid + 1;
            }
        }
        return ans;
    }
}