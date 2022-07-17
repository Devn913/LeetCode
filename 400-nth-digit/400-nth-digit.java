class Solution {
    public int findNthDigit(int n) {
        if(n<10) return n;
        if(n==Integer.MAX_VALUE) return 2; 
        int weight = 1;
        int counter = 1;
        int place =10;
        int num = 1;
        while(counter+weight <=n){
            counter+=weight;
            num++;
            if(num==place){
                place = place*10;
                weight++;
            }
        }
        for(int i = weight-1;i!=-1;i--){
            if(i==n-counter) return num%10;
            num = num/10;
        }
        return -1;
    }
}