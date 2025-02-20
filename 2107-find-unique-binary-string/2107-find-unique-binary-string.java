class Solution {
    public int convertToDecimal(String s){
        int num = 0;
        int pow_of_two = 1;
        for(int i = s.length()-1;i!=-1;i--){
            if(s.charAt(i) == '0'){
                pow_of_two = pow_of_two * 2;
                continue;
            }
            num = num + pow_of_two;
            pow_of_two = pow_of_two * 2;

        }
        return num;
    }
    public String convertToBinary(int num, int bits){
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<bits;i++){
            sb.append('0');
        }
        int index = bits - 1;
        while(num!=0){
            if(num%2==0){
                sb.setCharAt(index,'0');
            }else{
                sb.setCharAt(index,'1');
            }
            index--;
            num = num/2;
        }
        return sb.toString();
    }
    public String findDifferentBinaryString(String[] nums) {   
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(convertToDecimal(nums[i]));
        }
        int targetNum = 0;
        for(int i = 0;i<nums.length+1;i++){
            if(!set.contains(i)){
                targetNum = i;
                break;
            }
        }
        return convertToBinary(targetNum,nums.length);
    }
}