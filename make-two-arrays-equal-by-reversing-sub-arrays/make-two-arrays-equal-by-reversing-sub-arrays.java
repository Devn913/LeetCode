class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: target) map.put(num,map.getOrDefault(num,0)+1);
        for(int num: arr){
            map.put(num,map.getOrDefault(num,1)-1);
            if(map.get(num) == 0) map.remove(num);
        }
        return map.size() == 0;
    }
}