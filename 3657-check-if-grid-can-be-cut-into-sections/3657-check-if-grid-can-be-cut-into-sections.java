class Solution {

    public boolean checkValidCuts(int n, int[][] rectangles) {
        // Try both horizontal and vertical cuts
        return checkCuts(rectangles, 0) || checkCuts(rectangles, 1);
    }

    // Check if valid cuts can be made in a specific dimension
    private boolean checkCuts(int[][] rectangles, int dim) {
        int gapCount = 0;

        // Sort rectangles by their starting coordinate in the given dimension
        Arrays.sort(rectangles, (a, b) -> Integer.compare(a[dim], b[dim]));

        // Track the furthest ending coordinate seen so far
        int furthestEnd = rectangles[0][dim + 2];

        for (int i = 1; i < rectangles.length; i++) {
            int[] rect = rectangles[i];

            // If current rectangle starts after the furthest end we've seen,
            // we found a gap where a cut can be made
            if (furthestEnd <= rect[dim]) {
                gapCount++;
            }

            // Update the furthest ending coordinate
            furthestEnd = Math.max(furthestEnd, rect[dim + 2]);
        }

        // We need at least 2 gaps to create 3 sections
        return gapCount >= 2;
    }
}