class Solution {

    public int maximumCandies(int[] candies, long k) {
        // Find the maximum number of candies in any pile
        int maxCandiesInPile = 0;
        for (int i = 0; i < candies.length; i++) {
            maxCandiesInPile = Math.max(maxCandiesInPile, candies[i]);
        }

        // Set the initial search range for binary search
        int left = 0;
        int right = maxCandiesInPile;

        // Binary search to find the maximum number of candies each child can get
        while (left < right) {
            // Calculate the middle value of the current range
            int middle = (left + right + 1) / 2;

            // Check if it's possible to allocate candies so that each child gets 'middle' candies
            if (canAllocateCandies(candies, k, middle)) {
                // If possible, move to the upper half to search for a larger number
                left = middle;
            } else {
                // Otherwise, move to the lower half
                right = middle - 1;
            }
        }

        return left;
    }

    private boolean canAllocateCandies(
        int[] candies,
        long k,
        int numOfCandies
    ) {
        // Initialize the total number of children that can be served
        long maxNumOfChildren = 0;

        // Iterate over all piles to calculate how many children each pile can serve
        for (int pileIndex = 0; pileIndex < candies.length; pileIndex++) {
            maxNumOfChildren += candies[pileIndex] / numOfCandies;
        }

        return maxNumOfChildren >= k;
    }
}