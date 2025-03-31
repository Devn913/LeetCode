class Solution {
    public long putMarbles(int[] weights, int k) {
        ArrayList<Integer> pairs = new ArrayList<>();
        for(int i =1;i<weights.length;i++){
            pairs.add(weights[i]+weights[i-1]);
        }
        Collections.sort(pairs);
        long maxPairs = 0;
        long minPairs = 0;
        for(int i = 0;i<k-1;i++){
            minPairs+=pairs.get(i);
        }
        int index = 0;
        while(index<k-1){
            maxPairs+=pairs.get(pairs.size() - 1 - index);
            index++;
        }
        return maxPairs - minPairs;
    }
}