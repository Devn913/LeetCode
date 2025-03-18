class Solution {
    public boolean checkFrequency(int[] bitFrequecy){
        for(int i = 0;i<32;i++){
            if(bitFrequecy[i]>1) return false;
        }
        return true;
    }
    public int longestNiceSubarray(int[] nums) {
        int ans   = 0;
        int start = 0;
        int end   = 0;
        int[] bitFreq = new int[32];
        // for(int i = 0;i<32;i++){
        //     bitFreq[i] = 0;
        // }
        while(end<nums.length){
            while(checkFrequency(bitFreq)){
                
                ans = Math.max(ans,end-start);
                if(end == nums.length) break;
                int num = nums[end];
                end++;
                int index = 0;
                while(num!=0){
                    if(num%2!=0) bitFreq[index]++;
                    num = num / 2 ;
                    index++;
                }
            }
            int index = 0;
            int num = nums[start];
            while(num!=0){
                if(num%2!=0) bitFreq[index]--;
                num = num/2;
                index++;
            }
            start++;
        }
        return ans;
    }
}