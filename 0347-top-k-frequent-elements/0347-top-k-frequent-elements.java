class Solution {
    public class Node implements Comparable<Node>{
        int num;
        int frequency;
        Node(int num, int frequency){
            this.num       = num;
            this.frequency = frequency;
        }
        @Override
        public int compareTo(Node node){
            return Integer.compare(this.frequency,node.frequency);
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (Map.Entry<Integer,Integer> mapElement : map.entrySet()){
            pq.add(new Node(mapElement.getKey(),mapElement.getValue()));
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        for(int i =0;i<k;i++){
            ans[i] = pq.remove().num;
        }
        return ans;


    }
}