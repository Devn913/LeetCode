class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        for(int i = 0;i<k;i++){
            if(s.charAt(i)=='a' || s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) =='u'){
                ans++;
            }
        }
        int low = 0;
        int temp = ans;
        while(low+k!=s.length()){
            if(s.charAt(low)=='a' || s.charAt(low) == 'e'|| s.charAt(low) == 'i' || s.charAt(low) == 'o' || s.charAt(low) =='u'){
                temp--;
            }
            if(s.charAt(low+k)=='a' || s.charAt(low+k) == 'e'|| s.charAt(low+k) == 'i' || s.charAt(low+k) == 'o' || s.charAt(low+k) =='u'){
                temp++;
            }
            low++;
            ans = Math.max(ans,temp);
        }
        return ans;
    }
}