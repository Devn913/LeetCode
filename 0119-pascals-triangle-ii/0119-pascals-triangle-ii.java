class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            return list;
        }
        if(rowIndex == 1){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(1);
            return list;
        }
        List<Integer> prev = getRow(rowIndex-1);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 1;i<prev.size();i++){
            list.add(prev.get(i-1)+prev.get(i));
        }
        list.add(1);
        return list;
    }
}