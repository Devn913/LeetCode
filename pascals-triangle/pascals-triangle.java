class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int start = 1;
        List<Integer> first = new ArrayList(start);
        first.add(1);
        list.add(first);
        if(numRows==start) return list;
        while(numRows!=1){
            start = start+1;
            List<Integer> newList = new ArrayList<Integer>(start);
            newList.add(1);
            for(int i=1;i<start - 1;i++){
                newList.add(list.get(start-2).get(i-1)+list.get(start-2).get(i));
            }
            newList.add(1);
            list.add(newList);
            numRows--;
        }
        return list;
        
    }
}