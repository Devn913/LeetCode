class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        int[] res = new int[k];
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>();
        for(int i = 0;i<logs.length;i++){
            if(map.containsKey(logs[i][0])){
                HashSet<Integer> set = map.get(logs[i][0]);
                set.add(logs[i][1]);
                map.put(logs[i][0],set);
            }else{
                HashSet<Integer> set = new HashSet<>();
                set.add(logs[i][1]);
                map.put(logs[i][0],set);
            }
        }
        for(int key : map.keySet()) res[map.get(key).size()-1]++;
        return res;
    }
}