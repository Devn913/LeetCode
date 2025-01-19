class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int index = 0;
        while(left!=right){
            left = left >> 1;
            right = right >> 1;
            index++; 
        }
        return left << index;
    }
}