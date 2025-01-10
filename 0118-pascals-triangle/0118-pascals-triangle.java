class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> one = new ArrayList<>();
       one.add(1);
       result.add(one);
       if(numRows==1) return result;
       List<Integer> two = new ArrayList<>();
       two.add(1);
       two.add(1);
       result.add(two);
       if(numRows == 2) return result;

       for(int i = 2;i<numRows;i++){
            List<Integer> toAdd = new ArrayList<>();
            toAdd.add(1);
            for(int j = 1;j<result.get(i-1).size();j++){
                toAdd.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            toAdd.add(1);
            result.add(toAdd);
       }
       return result;
    }
}