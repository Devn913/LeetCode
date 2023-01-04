class Solution {
    public int min(int val, HashMap<Integer,Integer> map){
        if(val==2) return 1;
        if(val ==3) return 1;
        if(val == -1) return -1;
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
        int max = 0;
        for(int num: tasks){
            map.put(num,map.getOrDefault(num,0)+1);
            max = Math.max(max,num);
        }
        HashMap<Integer,Integer> map2 = new HashMap<>();
        map2.put(1,-1);
        map2.put(2,1);
        map2.put(3,1);
        
        int ans = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int val = entry.getValue();
            int temp = min(val,map2);
            if(temp==-1) return -1;
            ans+=temp;
        }
        return ans;
    }
}