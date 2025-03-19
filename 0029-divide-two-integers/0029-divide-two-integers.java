class Solution {
    public int divide(long dividend, long divisor) {
        long sign = 1;
        if(dividend<0){
            dividend = -dividend;
            sign = -1*sign; 
        }
        if(divisor<0){
            divisor = -divisor;
            sign = -1*sign;
        }
        if(dividend<divisor) return 0; 
        // if(dividend==divisor) return 1;

        long lastDivisor = divisor;
        long currentDivisor = divisor << 1;
        long ans = 1;
        while(currentDivisor<dividend){
            lastDivisor = currentDivisor;
            ans = ans << 1;
            currentDivisor = currentDivisor << 1;
        }

        long temp =  sign * (ans + divide(dividend - lastDivisor, divisor));
        if(temp>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(temp<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) temp;
        
        


    }
}