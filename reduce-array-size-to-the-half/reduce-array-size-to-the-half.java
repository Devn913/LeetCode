class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(map.size(), Collections.reverseOrder());
        for (Map.Entry mapElement : map.entrySet()){
            pq.add((int)mapElement.getValue());
        }
        int ans = 0;
        int counter = 0;
        while(counter<arr.length/2){
            counter+=pq.peek();
            pq.remove();
            ans++;
        }
        return ans;
    }
}