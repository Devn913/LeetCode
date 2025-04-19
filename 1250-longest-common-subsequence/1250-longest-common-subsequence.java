class Solution {
    public int LCS(int[][] memo, String s1, String s2, int m, int n){
        if(m<0 || n<0) return 0;
        if(memo[m][n] != -1) return memo[m][n];
        if(s1.charAt(m) == s2.charAt(n)){
            memo[m][n] = 1 + LCS(memo, s1, s2, m-1,n-1);
        }else{
            memo[m][n] = Math.max(LCS(memo,s1,s2,m-1,n),LCS(memo,s1,s2,m,n-1));
        }
        return memo[m][n];
    }
    
    public int longestCommonSubsequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] memo = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                memo[i][j] = -1;
            }
        }
        return LCS(memo,str1,str2,m-1,n-1);
    }
}