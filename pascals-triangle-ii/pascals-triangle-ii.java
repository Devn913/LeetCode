class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        if(rowIndex == 0) return prev;
        prev.add(1);
        if(rowIndex == 1) return prev;
        List<Integer> res = new ArrayList<>();
        while(rowIndex!=1){
            res.clear();
            res.add(1);
            for(int i = 1;i<prev.size();i++){
                res.add(prev.get(i-1)+prev.get(i));
            }
            res.add(1);
            prev.clear();
            prev.addAll(res);
            rowIndex--;
        }
        return res;
    }
}