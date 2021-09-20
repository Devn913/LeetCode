class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }else{
                map.put(arr[i],1);
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (Map.Entry ele : map.entrySet()) {
            if((int)ele.getValue()>1){
                list.add((int)ele.getKey());
            }
        }
        return list;
    }
}