class Solution {
    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        int N           = nums.length;
        int prefix      = 1;
        int suffix      = 1;
        for(int i = 0;i<N;i++){
            prefix = prefix*nums[i];
            suffix = suffix*nums[N-i-1];
            max_product = Math.max(prefix,Math.max(suffix,max_product));
            if(prefix ==0) prefix = 1;
            if(suffix == 0) suffix = 1;
        }
        return max_product;
    }
}