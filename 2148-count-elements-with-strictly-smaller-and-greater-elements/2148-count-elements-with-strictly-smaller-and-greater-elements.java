class Solution {
    public int countElements(int[] nums) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num: nums){
            max = Math.max(max,num);
            min = Math.min(min,num);
        }
        int countMax = 0;
        int countMin = 0;

        for(int num: nums){
            if(num == max) countMax++;
            if(num == min) countMin++;
        }
        if(max == min){
            return nums.length - (countMax);
        }
        return nums.length - (countMax+countMin);
    }
}