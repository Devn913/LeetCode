class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        int len = flowerbed.length;
        if(len == 1) return flowerbed[0] == 0 || n==0;
        if(flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            n--;
        }
        if(n==0) return true;
        if(flowerbed[len - 2] == 0 && flowerbed[len -1] == 0){
            flowerbed[len - 1] = 1;
            n--;
        }
        if(n==0) return true;
        while(i<len -2){
            if(flowerbed[i] == 0 && flowerbed[i+1] == 0 && flowerbed[i+2] == 0){
                flowerbed[++i] = 1;
                n--;
            }
            i = i+1;
            if(n==0) return true;
        }
        return n<=0;
    }
}