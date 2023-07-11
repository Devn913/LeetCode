class Solution {
    public void rotate(int[] nums, int k) {
        if(k>=nums.length) k = k%nums.length;
        if(k==0) return;
        k = nums.length - k;
        int temp[] = new int [k];
        for(int i = 0;i<k;i++){
            temp[i] = nums[i];
        }
        int counter = 0;
        for(int i =k;i<nums.length;i++){
            nums[counter++] = nums[i];
        }
        int counter2 = 0;
        for(int i = counter;i<nums.length;i++){
            nums[i] = temp[counter2++];
        }
    }
}