class Solution {  
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int res = 0;
        for(int i = 2;i< Math.sqrt(n);i++){
            if(notPrime[i]== false){
                for(int j = i*i;j<n;j=j+i){
                    notPrime[j] = true;
                }
            }
        }
        int counter = 2;
        while(counter<n){
            if(!notPrime[counter]){
                res++;
            }
            counter++;
        }
        return res;
    }
}