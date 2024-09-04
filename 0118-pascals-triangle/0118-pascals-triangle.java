class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        if(numRows == 1) return ans;
        
        int currentRow = 1;
        while(currentRow!= numRows){
            List<Integer> temp = ans.get(currentRow-1);
            ArrayList<Integer> currentRowToAdd = new ArrayList<>();
            currentRowToAdd.add(1);
            for(int i = 0;i<temp.size()-1;i++){
                currentRowToAdd.add(temp.get(i)+temp.get(i+1));
            }
            currentRowToAdd.add(1);
            ans.add(currentRowToAdd);
            currentRow++;
        }
        return ans;
    }
}