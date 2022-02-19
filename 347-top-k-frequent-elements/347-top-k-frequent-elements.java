class Solution {
    class pair implements Comparable<pair>{
        int value;
        int count;
        pair(int value, int count){
            this.value = value;
            this.count = count;
        }
        public int compareTo(pair p){
            return this.count - p.count;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums) map.put(num,map.getOrDefault(num,0)+1);
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for (Map.Entry mapElement : map.entrySet()) {
            pq.add(new pair((int) mapElement.getKey(),(int) mapElement.getValue()));
            if(pq.size()>k) pq.remove();
        }
        int[] res = new int[k];
        for(int i =0;i<k;i++){
            res[i] = pq.remove().value;
        }
        return res;
    }
}