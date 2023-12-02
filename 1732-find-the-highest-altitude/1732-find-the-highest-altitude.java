class Solution {
    public int largestAltitude(int[] gain) {
        int[] finalGains = new int[gain.length+1];
        finalGains[0] = 0;
        int ans = 0;
        for(int i = 0;i<gain.length;i++){
            finalGains[i+1] = finalGains[i] + gain[i];
            ans = Math.max(ans,finalGains[i+1]);
        }
        return ans;
    }
}