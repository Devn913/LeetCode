class Solution {
    public int[] rearrangeArray(int[] nums) {
        int neg = 0;
        int pos = 0;
        int[] result = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            int j = 0;
            if(i%2==0) j = pos;
            else j = neg;
            for(;j<nums.length;j++){
                if(nums[j] == 0) continue;
                if(i%2 == 0){
                    if(nums[j]>0){
                        pos = j;
                        break;
                    } 
                }else{
                    if(nums[j]<0){
                        neg = j;
                        break;
                    }
                }
            }
            result[i] = nums[j];
            nums[j]=0;
        }
        return result;
    }
}