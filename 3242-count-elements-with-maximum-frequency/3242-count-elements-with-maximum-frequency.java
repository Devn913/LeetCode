class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        int maxFreq = 0;
        for(int num: nums){
            if(!freqMap.containsKey(num)){
                freqMap.put(num,0);
            }
            freqMap.put(num,freqMap.get(num)+1);
            maxFreq = Math.max(freqMap.get(num),maxFreq);
        }

        int ans= 0;

        for(int key: freqMap.keySet()){
            if(freqMap.get(key) == maxFreq){
                ans+=maxFreq;
            }
        }
        return ans;

    }
}