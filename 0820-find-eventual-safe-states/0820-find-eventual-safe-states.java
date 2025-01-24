class Solution {
    public boolean dfs(int[][] graph, int currNode, boolean[] unSafeNode, boolean[] visited){
        if(unSafeNode[currNode]) return true;
        if(visited[currNode]) return false;

        visited[currNode] = true;
        unSafeNode[currNode] = true;
        for(int node: graph[currNode]){
            if(dfs(graph,node,unSafeNode,visited)){
                return true;
            }
        }
        unSafeNode[currNode] = false;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        boolean[] inStack = new boolean[n];
        for (int i = 0; i < n; i++) {
            dfs(graph, i, inStack, visit);
        }

        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!inStack[i]) {
                safeNodes.add(i);
            }
        }

        return safeNodes;

    }
}