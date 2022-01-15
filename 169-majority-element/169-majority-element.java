class Solution {
    public int majorityElement(int[] nums) {
        int element = 0;
        int counter = 0;
        for(int num: nums){
            if(counter == 0) element = num;
            if(element == num) counter++;
            else counter--;
        }
        return element;
    }
}