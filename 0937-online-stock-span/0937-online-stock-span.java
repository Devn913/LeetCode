class StockSpanner {
    ArrayList<Integer> list;

    public StockSpanner() {
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        int index = list.size() - 1;
        int ans = 1;
        while(index!=-1){
            if(list.get(index)>price) break;
            index--;
            ans++;
        }
        list.add(price);
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */