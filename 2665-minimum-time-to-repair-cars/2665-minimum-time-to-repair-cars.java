class Solution {

    public long repairCars(int[] ranks, int cars) {
        int minRank = ranks[0], maxRank = ranks[0];

        // Find min and max rank dynamically
        for (int rank : ranks) {
            minRank = Math.min(minRank, rank);
            maxRank = Math.max(maxRank, rank);
        }
        // Frequency array to count mechanics with each rank
        int[] freq = new int[maxRank + 1];
        for (int rank : ranks) {
            minRank = Math.min(minRank, rank);
            freq[rank]++;
        }

        // Minimum possible time, Maximum possible time
        long low = 1, high = 1L * minRank * cars * cars;

        // Perform binary search to find the minimum time required
        while (low < high) {
            long mid = (low + high) / 2;
            long carsRepaired = 0;

            // Calculate the total number of cars that can be repaired in 'mid' time
            for (int rank = 1; rank <= maxRank; rank++) {
                carsRepaired +=
                    freq[rank] * (long) Math.sqrt(mid / (long) rank);
            }

            // Adjust the search boundaries based on the number of cars repaired
            if (carsRepaired >= cars) {
                high = mid; // Try to find a smaller time
            } else {
                low = mid + 1; // Need more time
            }
        }

        return low;
    }
}