class Cashier {
    HashMap<Integer,Integer> map;
    public int N;
    public int dis;
    public int customerNo;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        map = new HashMap<>(products.length);
        for(int i=0;i<products.length;i++){
            map.put(products[i],prices[i]);
        }
        N = n;
        dis = discount;
        customerNo = 0;
        
    }
    
    public double getBill(int[] product, int[] amount) {
        double total = 0;
        customerNo++;
        for(int i =0;i<product.length;i++){
            total+=(map.get(product[i])*amount[i]);
        }
        if(customerNo==N){
            total = total*((double)(100-dis)/100);
            customerNo=0;
        }
        return total;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */