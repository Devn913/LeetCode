class Solution {
    private int longestPath = 1;
    public int maxOpenPath(int curr, HashMap<Integer,List<Integer>> map, String s){
        if(!map.containsKey(curr)) return 1;
        List<Integer> list = map.get(curr);
        int longestChain = 0;
        int secondLongestChain = 0;
        for(int child: list){
            int longestChainStartingFromChild = maxOpenPath(child, map, s);
            if(s.charAt(curr)  == s.charAt(child)) continue;
            if (longestChainStartingFromChild > longestChain) {
                secondLongestChain = longestChain;
                longestChain = longestChainStartingFromChild;
            } else if (longestChainStartingFromChild > secondLongestChain) {
                secondLongestChain = longestChainStartingFromChild;
            }
        }
        longestPath = Math.max(longestPath, longestChain + secondLongestChain + 1);
        return longestChain + 1;
        
    }
    public int longestPath(int[] parent, String s) {
        HashMap<Integer,List<Integer>> map = new HashMap<>();
        map.put(0,new ArrayList<Integer>());
        for(int i = 1;i<parent.length;i++){
            List<Integer> list = map.getOrDefault(parent[i],new ArrayList<Integer>());
            list.add(i);
            map.put(parent[i],list);
        }
        maxOpenPath(0,map,s);
        return longestPath;
        
    }
}