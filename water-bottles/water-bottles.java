class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        while (numBottles >= numExchange) {
            int rem = numBottles % numExchange;
            numBottles /= numExchange;
            res += numBottles;
            numBottles += rem;
        }
        return res;
    }
}