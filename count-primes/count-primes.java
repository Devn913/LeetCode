class Solution {  
    public int countPrimes(int n) {
        if(n<=1) return 0;
        boolean[] notPrime = new boolean[n];
        int res = 0;
        for(int i = 2;i< Math.sqrt(n);i++){
            if(notPrime[i]== false){
                for(int j = i*i;j<n;j=j+i){
                     if(!(notPrime[j])){
                         notPrime[j] = true;
                         res++;
                     }
                    
                }
            }
        }
        return n-res-2;
    }
}
