class Solution {
    public int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix  =1;

        int ans = Integer.MIN_VALUE;
        int N = nums.length;
        for(int i = 0;i<N;i++ ){
            prefix = prefix *nums[i];
            suffix = suffix * nums[N-i-1];

            ans = Math.max(ans, Math.max(prefix,suffix));

            if(prefix == 0) prefix =1;
            if(suffix == 0) suffix = 1;
        } 
        return ans;
    }
}