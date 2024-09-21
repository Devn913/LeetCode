class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1;i<=9;i++){
            generate(result,i,n);
        }
        return result;
    }
    public void generate(List<Integer> result, int current, int limit){
        if(current>limit) return;
        result.add(current);
        for(int nextDigit = 0;nextDigit<=9;nextDigit++){
            int nextNumber = current * 10 + nextDigit;
            if(nextNumber<=limit){
                generate(result, nextNumber, limit);
            }else{
                break;
            }
        }
    }
}