class Solution {
    public int countElements(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int countMax = 0;
        int countMin = 0;
        for(int num: nums){
            if(num>max){
                max = num;
                countMax = 1;
            }else if(num == max) countMax++;
            if(num<min){
                min = num;
                countMin = 1;
            }else if(num == min) countMin++;
        }
        if(max == min){
            return nums.length - (countMax);
        }
        return nums.length - (countMax+countMin);
    }
}