// Approach: 1 Recursion: TLE
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

// Approach 2: Memoization
// class Solution {
//     public int helper(List<List<Integer>> traingle,int[][] memo, int currentRow, int currentCol){
//         if(currentRow>=traingle.size() || currentCol>=traingle.get(currentRow).size()) return 0;
//         if(memo[currentRow][currentCol]!=-1) return memo[currentRow][currentCol];
//         memo[currentRow][currentCol]  = traingle.get(currentRow).get(currentCol) + Math.min(
//                         helper(traingle,memo,currentRow+1,currentCol),
//                         helper(traingle,memo,currentRow+1,currentCol+1)
//                     );
//         return memo[currentRow][currentCol];
//     }
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int[][] memo = new int[triangle.size()][triangle.size()];
//         for(int i = 0;i<memo.length;i++){
//             for(int j = 0;j<memo.length;j++){
//                 memo[i][j] = -1;
//             }
//         }
//         return helper(triangle,memo,0,0);
//     }
// }

// Approach 3: Dyannamic Programming
class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()+1][triangle.size()+1];

        for(int i = triangle.size() - 1;i!=-1;i--){
            for(int j = triangle.get(i).size()-1;j!=-1;j--){
                dp[i][j]  = triangle.get(i).get(j) + Math.min(
                        dp[i+1][j],
                        dp[i+1][j+1]
                );
            }
        }

        return dp[0][0];
    }
}