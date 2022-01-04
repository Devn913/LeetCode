class Solution {
    public int bitwiseComplement(int n) {
        if(n==0) return 1;
        boolean[] arr = new boolean[32];
        int counter = 0;
        while(n!=0){
            if(n%2==0) arr[counter] = true;
            else arr[counter] = false;
            n = n/2;
            counter++;
        }
        int secondCounter = 0;
        while(secondCounter<=counter){
            if(arr[secondCounter]) n = n + (int)Math.pow(2, secondCounter);
            secondCounter++;
        }
        return n;
    }
}