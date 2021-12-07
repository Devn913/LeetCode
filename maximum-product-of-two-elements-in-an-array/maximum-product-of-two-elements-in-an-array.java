class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int secondMax = -1;
        for(int num: nums){
            if(num>max){
                secondMax = max;
                max = num;
            }else if(num<=max && num>secondMax){
                secondMax = num;
            }
        }
        return (max-1)*(secondMax-1);
    }
}