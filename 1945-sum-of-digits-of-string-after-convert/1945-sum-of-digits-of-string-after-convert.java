class Solution {
    public int transform(int num, int k){
        if(k==0) return num;
        int sum = 0;
        while(num!=0){
            sum += num%10;
            num = num/10;
        }
        return transform(sum,k-1);
    }
    public int getLucky(String s, int k) {
        int sum = 0;
        int temp;
        for(int i = 0;i<s.length();i++){
            temp =(int) s.charAt(i)  - 96;
            sum  = sum + temp%10 + temp/10;
        }
   
        return k == 1 ? sum : transform(sum,k-1);
    
        
    }
}