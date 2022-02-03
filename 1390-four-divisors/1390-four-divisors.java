class Solution {
    public int divisor(int num){
        int counter = 0;
        int sum = 0;
        int i = 1;
        for(;i*i<num;i++){
            if(num%i==0){
                counter+=2;
                sum+=i;
                sum+=(num/i);
            }
            if(counter>4) return 0;
        }
        if(i*i == num){
            counter++;
            sum+=i;
        }
        if(counter==4) return sum;
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int res = 0;
        for(int num: nums){
            res+=divisor(num);
        }
        return res;
    }
}