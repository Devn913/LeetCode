class Solution {
    public int min(int val, HashMap<Integer,Integer> map){
        if(map.containsKey(val)) return map.get(val);
        int temp1 = min(val-2,map);
        int temp2 = min(val-3,map);
        if(temp1 == -1 && temp2==-1){
            map.put(val,-1);
        }
        else if(temp1==-1){
            map.put(val,temp2+1);
        }else if(temp2==-1){
            map.put(val,temp1+1);
        }else{
            map.put(val,Math.min(temp1,temp2)+1);
        }
        return map.get(val);
    }
    public int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: tasks){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans = 0;
        for(int val: map.values()){
            if(val == 1) return -1;
            if(val%3==0) ans+=val/3;
            else ans+=(val/3 +1);
        }
        return ans;
    }
}