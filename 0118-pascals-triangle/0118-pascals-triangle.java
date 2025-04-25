class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        result.add(one);

        if(numRows == 1) return result;

        List<Integer> two = new ArrayList<>();
        two.add(1);
        two.add(1);
        result.add(two);


        if(numRows == 2) return result;


        for(int i = 2;i<numRows;i++){
            List<Integer> prev = result.get(i-1);
            List<Integer> next = new ArrayList<>();
            next.add(1);
            for(int j = 1;j<prev.size();j++){
                next.add(prev.get(j-1)+ prev.get(j));
            }
            next.add(1);
            result.add(next);
        }
        return result;
    }
}