class Solution {
    public int minOperations(String[] logs) {
        int ans = 0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("./")){
                continue;
            }else if(logs[i].equals("../")){
                ans--;
                ans = Math.max(0,ans);
            }else{
                ans++;
            }
           
        }
         return ans;
    }
}