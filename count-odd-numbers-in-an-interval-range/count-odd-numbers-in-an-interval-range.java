class Solution {
    public int countOdds(int low, int high) {
        int res = 0;
        if(low%2!=0) res++;
        else if(high%2!=0) res++;
        res+=(high-low)/2;
        
        return res;
    }
}