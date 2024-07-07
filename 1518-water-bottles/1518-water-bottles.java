class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while(numBottles>= numExchange){
            int filledBottleAfterExchange = numBottles / numExchange;
            int leftEmptyBottles          = numBottles % numExchange;
            ans+=filledBottleAfterExchange;
            numBottles = leftEmptyBottles + filledBottleAfterExchange;
        }
        return ans;
    }
}