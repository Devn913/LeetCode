class Solution {

    public int minOperations(int[][] grid, int x) {
        List<Integer> numsArray = new ArrayList<>();
        int result = 0;

        // Flatten the grid into numsArray and check remainder condition
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                if (grid[row][col] % x != grid[0][0] % x) return -1;
                // If any element has a different remainder than the first
                // element, it is impossible to make all elements equal, so
                // return -1
                numsArray.add(grid[row][col]);
            }
        }

        Collections.sort(numsArray);

        int length = numsArray.size();
        int prefixIndex = 0;
        int suffixIndex = length - 1;

        // Move prefixIndex and suffixIndex towards the middle
        while (prefixIndex < suffixIndex) {
            // If the prefix of equal elements is shorter than the suffix
            if (prefixIndex < length - suffixIndex - 1) {
                // Calculate the number of operations required to extend the prefix
                int prefixOperations =
                    ((prefixIndex + 1) *
                        (numsArray.get(prefixIndex + 1) -
                            numsArray.get(prefixIndex))) /
                    x;
                result += prefixOperations;
                // Move the prefix index forward
                prefixIndex++;
            } else {
                // Calculate the number of operations required to extend the suffix
                int suffixOperations =
                    ((length - suffixIndex) *
                        (numsArray.get(suffixIndex) -
                            numsArray.get(suffixIndex - 1))) /
                    x;
                result += suffixOperations;
                // Move the suffix index backward
                suffixIndex--;
            }
        }

        return result;
    }
}