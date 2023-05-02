class Solution {
    public int arraySign(int[] nums) {
        boolean negative = false;
        for(int val: nums){
            if(val==0) return 0;
            else if(val<0) negative = !negative;
        }
        if(negative == false) return 1;
        return -1;
    }
}