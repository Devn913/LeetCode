class Solution {
    public int maxCoins(int[] piles){
        Arrays.sort(piles);
        int counter = 0;
        int len = piles.length;
        int current = piles.length-2;
        int res = 0;
        while(counter<len/3){
            res+=piles[current];
            current-=2;
            counter++;
        }
        return res;
        
    }
}