class Solution {
    public int helper(int current, int parent, HashMap<Integer,List<Integer>> map,List<Boolean> hasApple){
        if(!map.containsKey(current)) return 0;
        int ans = 0;
        for(int child: map.get(current)){
            if(child == parent) continue;
            int childTime = helper(child,current,map,hasApple);
            if (childTime > 0 || hasApple.get(child))
                ans += childTime + 2;
        }
        return ans;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        for(int[] edge: edges){
            int a = edge[0];
            int b = edge[1];
            List<Integer> list = map.getOrDefault(a,new ArrayList<Integer>());
            list.add(b);
            map.put(a,list);
            list = map.getOrDefault(b,new ArrayList<Integer>());
            list.add(a);
            map.put(b,list);
        }
        return helper(0,-1,map,hasApple);
    }
}