class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne  =  0;
        for(int num: nums){
            switch(num){
                case 0:
                    countZero++;
                    break;
                case 1:
                    countOne++;
            }
        }
        int currentIndex = -1;
        while(0<countZero--){
            nums[++currentIndex] = 0;
            // countZero--;
        }
        while(0<countOne--){
            nums[++currentIndex] = 1;
            // countOne--;
        }
        while(currentIndex<n-1){
            nums[++currentIndex] = 2;
        }
    }
}