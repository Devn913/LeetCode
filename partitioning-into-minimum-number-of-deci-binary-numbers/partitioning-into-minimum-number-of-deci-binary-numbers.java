class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i = 0;i<n.length();i++){
            if(  (int) n.charAt(i) - 48   > max){
                max =  (int) n.charAt(i) - 48;
            }
            if(max == 9){
                return max;
            }
        }
        return max;
    }
}