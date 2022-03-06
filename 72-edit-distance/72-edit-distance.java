class Solution {
    public int helper(String word1, String word2, int i, int j, int[][] dp){
        if(dp[i][j]!=-1) return dp[i][j];
        if(i == word1.length() && j == word2.length()) return 0;
        if(i == word1.length() && j!=word2.length()){
            return word2.length() - j;
        }
        if(i!=word1.length() && j == word2.length()){
            return word1.length() - i;
        }
        int ans = Integer.MAX_VALUE;
        if(word1.charAt(i) == word2.charAt(j)){
            ans  = helper(word1,word2,i+1,j+1,dp);
        }else{
            ans = 1+Math.min(helper(word1,word2,i+1,j+1,dp),Math.min(helper(word1,word2,i,j+1,dp),helper(word1,word2,i+1,j,dp)));
        }
        dp[i][j] = ans;
        return dp[i][j];
        
    }
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()+1][word2.length()+1];
        for(int i = 0;i<=word1.length();i++){
            for(int j = 0;j<=word2.length();j++){
                dp[i][j] = -1;
            }
        }
        return helper(word1,word2,0,0,dp);
    }
}