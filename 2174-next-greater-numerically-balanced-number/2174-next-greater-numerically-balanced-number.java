class Solution {
    public boolean isBalanced(int num){
        HashMap<Integer,Integer> map = new HashMap<>();
        while(num!=0){
            map.put(num%10, map.getOrDefault(num%10,0)+1);
            num = num/10;
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getKey()!= entry.getValue()) return false;
            
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        n++;
        while(!isBalanced(n)){
            n++;
        }
        return n;
    }
}