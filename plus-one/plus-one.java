class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1;i!=-1;i--){
            if(digits[i]==9) {
                digits[i]=0;
                carry = 1;
            }
            else {
                digits[i]+=carry;
                carry = 0;
            }
            if(carry==0) break;
        }
        if(carry==1){
            int[] newArr = new int[digits.length+1];
            int counter = 0;
            newArr[counter++] = 1;
            for(int num: digits){
                newArr[counter++] = num;
            }
            return newArr;
        }
        return digits;
    }
}