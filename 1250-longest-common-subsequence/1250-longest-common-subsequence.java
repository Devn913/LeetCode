class Solution {
    public int LCS(int[][] memo, String s1, String s2, int i, int j, int len1, int len2){
        if(i>=len1 || j>=len2) return 0;
        if(memo[i][j] != -1) return memo[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            memo[i][j] = 1 + LCS(memo, s1, s2, i+1, j+1, len1,len2);
        }else{
            memo[i][j] = Math.max(LCS(memo,s1,s2,i+1,j,len1,len2),LCS(memo,s1,s2,i,j+1,len1,len2));
        }
        return memo[i][j];
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
        return LCS(memo,str1,str2,0,0,m,n);
    }
}