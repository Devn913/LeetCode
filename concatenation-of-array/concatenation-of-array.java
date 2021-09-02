class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[2*nums.length];
        boolean reset = true;
        int counter= 0;
        for(int i = 0;i<2*nums.length;i++){
            result[i] = nums[counter];
            counter++;
            if(counter == nums.length && reset){
                counter=0;
                reset = false;
            }
            
        }
        return result;
        
    }
}