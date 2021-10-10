class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int counter = 0;
        while(left!=right){
            left = left>>1;
            right = right>>1;
            counter++;
        }
        
        while(counter!=0){
            left = left<<1;
            counter--;
        }
        return left;
    }
}