class Solution {
    public int lcs(String text1, String text2, int i, int j, int[][] dp){
        if(i == text1.length() || j == text2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i) == text2.charAt(j)){
            dp[i][j] = 1 + lcs(text1,text2,i+1,j+1,dp);
        }else{
            dp[i][j] = Math.max(lcs(text1,text2,i+1,j,dp),lcs(text1,text2,i,j+1,dp));
        }
        return dp[i][j];
               
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i = 0;i<text1.length();i++){
            for(int j = 0;j<text2.length();j++){
                dp[i][j] = -1;
            }
        }
        return lcs(text1,text2,0,0,dp);
    }
}