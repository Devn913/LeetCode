class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i = 0;i<edges.length;i++){
            if(!graph.containsKey(edges[i][0])){
                List<Integer> list = new ArrayList<>();
                graph.put(edges[i][0], list);
            }
            if(!graph.containsKey(edges[i][1])){
                List<Integer> list = new ArrayList<>();
                graph.put(edges[i][1], list);
            }
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
        }
        int ans = 0;
        for(int i = 0;i<n;i++){
            if(!graph.containsKey(i)){
                List<Integer> list = new ArrayList<>();
                graph.put(i,list);
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                int nodes = 1;
                int edge = 0;
                q.add(i);
                visited[i] = true;
                while(!q.isEmpty()){
                    List<Integer> list = graph.get(q.remove());
                    
                    for(int j = 0;j<list.size();j++){
                        edge++;
                        if(!visited[list.get(j)]){
                            nodes++;
                            visited[list.get(j)] = true;
                            q.add(list.get(j));
                            
                        }
                    }
                }
                edge = edge/2;
                System.out.println("Edges: "+ edge+" Nodes: "+ nodes);
                if(edge == (nodes*(nodes-1))/2) ans++;
            }
        } 
        return ans;


    }
}