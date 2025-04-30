class Solution {
    public boolean isEvenDigit(int num){
        boolean ans = true;
        while(num!=0){
            num = num /10;
            ans = !ans;
        } 
        return ans;

    }
    public int findNumbers(int[] nums) {
        int count  = 0;
        for(int num: nums){
            if(isEvenDigit(num)) count++;
        }
        return count;
    }
}