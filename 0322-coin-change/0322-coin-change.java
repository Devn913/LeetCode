class Solution {
    
    public int coinChange(int[] coins, int amount, int index, int[][] dp){
        if(amount == 0) return 0;
        if(index>=coins.length) return -1;
        if(dp[amount][index] != -2) return dp[amount][index];
        int ans = Integer.MAX_VALUE;
        if(coins[index]<=amount){
            int temp  = coinChange(coins,amount-coins[index],index,dp);
            int temp3 = coinChange(coins,amount,index+1,dp);
            if(temp == -1 && temp3 == -1) ans = -1;
            else{
                if(temp == -1) ans = temp3;
                else if(temp3 == -1) ans = temp + 1;
                else ans = Math.min(1+temp,temp3);
                
                
            }
        }else{
            ans = coinChange(coins,amount,index+1,dp);
        }
        dp[amount][index] = ans;
        return ans;
        

    }

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[amount+1][n];
        for(int i = 0;i<amount+1;i++){
            for(int j = 0;j<n;j++){
                dp[i][j] = -2;
            }
        }
        return coinChange(coins, amount, 0,dp);
    }
}