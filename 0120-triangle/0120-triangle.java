// Approach: 1 TLE
// class Solution {
//     public int helper(List<List<Integer>> traingle, int currentRow, int currentCol){
//         if(currentRow>=traingle.size() || currentCol>=traingle.get(currentRow).size()) return 0;
//         return traingle.get(currentRow).get(currentCol) + Math.min(
//                         helper(traingle,currentRow+1,currentCol),
//                         helper(traingle,currentRow+1,currentCol+1)
//                     );
//     }
//     public int minimumTotal(List<List<Integer>> triangle) {
//         return helper(triangle,0,0);
//     }
// }

class Solution {
    public int helper(List<List<Integer>> traingle,int[][] memo, int currentRow, int currentCol){
        if(currentRow>=traingle.size() || currentCol>=traingle.get(currentRow).size()) return 0;

        if(memo[currentRow][currentCol]!=-1) return memo[currentRow][currentCol];
        memo[currentRow][currentCol]  = traingle.get(currentRow).get(currentCol) + Math.min(
                        helper(traingle,memo,currentRow+1,currentCol),
                        helper(traingle,memo,currentRow+1,currentCol+1)
                    );
        return memo[currentRow][currentCol];
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] memo = new int[triangle.size()][triangle.size()];
        for(int i = 0;i<memo.length;i++){
            for(int j = 0;j<memo.length;j++){
                memo[i][j] = -1;
            }
        }

        return helper(triangle,memo,0,0);
    }
}