class Solution {
    public boolean isNStraightHand(int[] nums, int k) {
        if(nums.length%k!=0) return false;
        HashMap<Integer,Integer> map = new HashMap<>();
        int start = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num: nums){
            map.put(num,map.getOrDefault(num,0)+1);
            start = Math.min(start,num);
            max = Math.max(max,num);
        }
        while(start<=max){
            int nextMin=-1;
            int K = k;
            if(map.containsKey(start)){
                while(K!=0){
                    if(!map.containsKey(start)) return false;
                    map.put(start,map.get(start)-1);
                    if(map.get(start) == 0){
                        map.remove(start);
                    }
                    if(nextMin == -1 && map.containsKey(start)) nextMin = start;
                    start++;
                    K--;
                }
                if(nextMin!=-1) start = nextMin;
            }else{
                start++;
            }
        }
        return true;

    }
}