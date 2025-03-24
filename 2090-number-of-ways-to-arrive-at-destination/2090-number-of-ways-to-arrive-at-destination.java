class Solution {

    private static final int MOD = 1_000_000_007;

    public int countPaths(int n, int[][] roads) {
        long[][][] dp = new long[n][n][2];

        // dp[src][dest][0] stores the minimum time between src and dest
        // dp[src][dest][1] stores the number of ways to reach dest from src
        // with the minimum time

        // Initialize the dp table
        for (int src = 0; src < n; src++) {
            for (int dest = 0; dest < n; dest++) {
                if (src != dest) {
                    // Set a large initial time
                    dp[src][dest][0] = (long) 1e12;
                    // No paths yet
                    dp[src][dest][1] = 0;
                } else {
                    // Distance from a node to itself is 0
                    dp[src][dest][0] = 0;
                    // Only one trivial way (staying at the node)
                    dp[src][dest][1] = 1;
                }
            }
        }

        // Initialize direct roads from the input
        for (int[] road : roads) {
            int startNode = road[0], endNode = road[1], travelTime = road[2];
            dp[startNode][endNode][0] = travelTime;
            dp[endNode][startNode][0] = travelTime;
            // There is one direct path
            dp[startNode][endNode][1] = 1;
            // Since the roads are bidirectional
            dp[endNode][startNode][1] = 1;
        }

        // Apply the Floyd-Warshall algorithm to compute shortest paths
        // Intermediate node
        for (int mid = 0; mid < n; mid++) {
            // Starting node
            for (int src = 0; src < n; src++) {
                // Destination node
                for (int dest = 0; dest < n; dest++) {
                    // Avoid self-loops
                    if (src != mid && dest != mid) {
                        long newTime = dp[src][mid][0] + dp[mid][dest][0];

                        if (newTime < dp[src][dest][0]) {
                            // Found a shorter path
                            dp[src][dest][0] = newTime;
                            dp[src][dest][1] =
                                (dp[src][mid][1] * dp[mid][dest][1]) % MOD;
                        } else if (newTime == dp[src][dest][0]) {
                            // Another way to achieve the same shortest time
                            dp[src][dest][1] =
                                (dp[src][dest][1] +
                                    dp[src][mid][1] * dp[mid][dest][1]) %
                                MOD;
                        }
                    }
                }
            }
        }

        // Return the number of shortest paths from node (n-1) to node 0
        return (int) dp[n - 1][0][1];
    }
}