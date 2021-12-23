class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        for (Map.Entry<Integer, Integer> entrySet :map.entrySet()) {
            set.add(entrySet.getValue());
        }
        return map.size() == set.size();
    }
}