class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int counter = 0;
        int num = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<pivot){
                res[counter] = nums[i];
                counter++;
            }else if(nums[i] == pivot) num++;
        }
        while(num!=0){
            res[counter] = pivot;
            counter++;
            num--;
        }
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>pivot){
                res[counter] = nums[i];
                counter++;
            }
        }
        return res;
    }
}