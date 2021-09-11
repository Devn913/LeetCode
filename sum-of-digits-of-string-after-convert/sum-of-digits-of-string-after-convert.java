class Solution {
    
    public int transform(int num, int k){
        if(k==0){
            return num;
        } 
        int shortResult=0;
        while(num!=0){
            shortResult += num%10;
            num/=10;
        }
        return transform(shortResult,k-1);
        
    }
    
    public int getLucky(String s, int k) {
        int sum = 0;
        int temp;
        for(int i = 0; i<s.length();i++){
            temp = (int) s.charAt(i) - 96;
            if(temp<10){
                sum = sum + temp;
            } else{
                while(temp!=0){
                    sum = sum + temp%10;
                    temp/=10;
                }
            }
        }
        if(k==1){
            return sum;
        }
        return transform(sum,k-1);
    }
}