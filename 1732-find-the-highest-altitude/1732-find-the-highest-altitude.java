class Solution {
    public int largestAltitude(int[] gain) {
        int low = 0;
        int ans = 0;
        for(int i = 0;i<gain.length;i++){
            low = low + gain[i];
            ans = Math.max(ans,low);
        }
        return ans;
    }
}