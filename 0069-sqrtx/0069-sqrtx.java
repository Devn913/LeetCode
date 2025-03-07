class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int mid = low + (high-low)/2;
        int ans = mid;
        while(low<=high){
            mid = low + (high-low)/2;
            if(1l*mid*mid<=x){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}