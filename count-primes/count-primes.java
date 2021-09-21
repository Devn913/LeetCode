class Solution {  
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        for(int i=2;i<n;i++){
            prime[i] = true;
        }
        for(int i = 2;i< Math.sqrt(n);i++){
            if(prime[i]== true){
                for(int j = i*i;j<n;j=j+i){
                    prime[j] = false;
                }
            }
        }
        int counter = 2;
        int res = 0;
        while(counter<n){
            if(prime[counter]){
                res++;
            }
            counter++;
        }
        return res;
    }
}