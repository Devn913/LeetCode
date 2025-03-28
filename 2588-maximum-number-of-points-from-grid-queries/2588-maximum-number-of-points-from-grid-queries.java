class Solution {

    // Represents a cell in the grid with row index, column index, and value
    record Cell(int row, int col, int value) {}

    // Represents a query with its original index and value
    record Query(int index, int value) {}

    // Right, Left, Down, Up
    private static final int[] ROW_DIRECTIONS = { 0, 0, 1, -1 };
    // Corresponding column moves
    private static final int[] COL_DIRECTIONS = { 1, -1, 0, 0 };

    public int[] maxPoints(int[][] grid, int[] queries) {
        int rowCount = grid.length, colCount = grid[0].length;
        int totalCells = rowCount * colCount;

        // Store queries with their original indices to maintain result order
        Query[] sortedQueries = new Query[queries.length];
        for (int i = 0; i < queries.length; i++) {
            sortedQueries[i] = new Query(i, queries[i]);
        }
        // Sort queries in ascending order
        Arrays.sort(sortedQueries, (a, b) -> Integer.compare(a.value, b.value));

        // Store all grid cells and sort them by value
        Cell[] sortedCells = new Cell[totalCells];
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                sortedCells[row * colCount + col] = new Cell(
                    row,
                    col,
                    grid[row][col]
                );
            }
        }
        // Sort cells by value
        Arrays.sort(sortedCells, (a, b) -> Integer.compare(a.value, b.value));

        // Union-Find to track connected components
        UnionFind uf = new UnionFind(totalCells);
        int[] result = new int[queries.length];
        int cellIndex = 0;

        // Process queries in sorted order
        for (Query query : sortedQueries) {
            // Process cells whose values are smaller than the current query value
            while (
                cellIndex < totalCells &&
                sortedCells[cellIndex].value < query.value
            ) {
                int row = sortedCells[cellIndex].row;
                int col = sortedCells[cellIndex].col;
                // Convert 2D position to 1D index
                int cellId = row * colCount + col;

                // Merge the current cell with its adjacent cells that have already been
                // processed
                for (int direction = 0; direction < 4; direction++) {
                    int newRow = row + ROW_DIRECTIONS[direction];
                    int newCol = col + COL_DIRECTIONS[direction];

                    // Check if the new cell is within bounds and its value is smaller than the
                    // query value
                    if (
                        newRow >= 0 &&
                        newRow < rowCount &&
                        newCol >= 0 &&
                        newCol < colCount &&
                        grid[newRow][newCol] < query.value
                    ) {
                        uf.union(cellId, newRow * colCount + newCol);
                    }
                }
                cellIndex++;
            }
            // Get the size of the connected component containing the top-left cell (0,0)
            result[query.index] = query.value > grid[0][0] ? uf.getSize(0) : 0;
        }
        return result;
    }
}

class UnionFind {

    private final int[] parent;
    private final int[] size;

    public UnionFind(int n) {
        parent = new int[n];
        size = new int[n];
        // Initialize all parents to -1 (disjoint sets)
        Arrays.fill(parent, -1);
        // Each component starts with size 1
        Arrays.fill(size, 1);
    }

    // Find with path compression
    public int find(int node) {
        // If negative, it's the root
        if (parent[node] < 0) return node;
        // Path compression
        return parent[node] = find(parent[node]);
    }

    // Union by size (merge smaller tree into larger tree)
    public boolean union(int nodeA, int nodeB) {
        int rootA = find(nodeA), rootB = find(nodeB);
        // Already connected
        if (rootA == rootB) return false;

        if (size[rootA] > size[rootB]) {
            parent[rootB] = rootA;
            size[rootA] += size[rootB];
        } else {
            parent[rootA] = rootB;
            size[rootB] += size[rootA];
        }
        return true;
    }

    // Get the size of the component containing a given node
    public int getSize(int node) {
        return size[find(node)];
    }
}