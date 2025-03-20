class Solution {

    public int[] minimumCost(int n, int[][] edges, int[][] queries) {
        // Create the adjacency list of the graph
        List<List<int[]>> adjList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>(2));
        }
        for (int[] edge : edges) {
            adjList.get(edge[0]).add(new int[] { edge[1], edge[2] });
            adjList.get(edge[1]).add(new int[] { edge[0], edge[2] });
        }

        boolean[] visited = new boolean[n];

        // Array to store the component ID of each node
        int[] components = new int[n];
        List<Integer> componentCost = new ArrayList<>(n);

        int componentId = 0;

        // Perform DFS for each unvisited node to identify components and calculate their costs
        for (int node = 0; node < n; node++) {
            // If the node hasn't been visited, it's a new component
            if (!visited[node]) {
                // Get the component cost and mark all nodes in the component
                componentCost.add(
                    getComponentCost(
                        node,
                        adjList,
                        visited,
                        components,
                        componentId
                    )
                );
                // Increment the component ID for the next component
                componentId++;
            }
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            if (components[start] == components[end]) {
                // If they are in the same component, return the precomputed cost for the component
                answer[i] = componentCost.get(components[start]);
            } else {
                // If they are in different components, return -1
                answer[i] = -1;
            }
        }

        return answer;
    }

    // Helper function to calculate the cost of a component using BFS
    private int getComponentCost(
        int node,
        List<List<int[]>> adjList,
        boolean[] visited,
        int[] components,
        int componentId
    ) {
        // Initialize the cost to the number that has only 1s in its
        // binary representation
        int currentCost = Integer.MAX_VALUE;

        // Mark the node as part of the current component
        components[node] = componentId;
        visited[node] = true;

        // Explore all neighbors of the current node
        for (int[] neighbor : adjList.get(node)) {
            int weight = neighbor[1];

            // Update the cost by performing a bitwise AND of the edge
            // weights
            currentCost &= weight;

            if (!visited[neighbor[0]]) {
                // Recursively calculate the cost of the rest of the component
                // and accumulate it into currentCost
                currentCost &= getComponentCost(
                    neighbor[0],
                    adjList,
                    visited,
                    components,
                    componentId
                );
            }
        }

        return currentCost;
    }
}