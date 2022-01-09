class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;
        int sum = (n * (n+1))/2;
        for(int i = 0;i<n;i++){
            int temp = 0;
            int temp2 = 0;
            HashSet<Integer> map = new HashSet<>(n);
            for(int j = 0;j<n;j++){
                map.add(matrix[i][j]);
                temp+=matrix[i][j];
                temp2+=matrix[j][i];
            }
            if(temp!=sum || temp2!=sum) return false;
            if(map.size()!=n) return false;
        }
        return true;
    }
}