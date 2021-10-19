class Solution {
    public int diagonalSum(int[][] mat) {
        int c1 = 0;
        int c2 = mat.length -1;
        int sum = 0;
        while(c1<mat.length){
            sum = sum + mat[c1][c1] +mat[c1][c2];
            c1++;
            c2--;
        }
        if(c1%2!=0) sum = sum - mat[c1/2][c1/2];
        return sum;
    }
}