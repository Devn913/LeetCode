class MinStack {

    class Pair{
        int value;
        int min;

        Pair(int v, int m){
            this.value = v;
            this.min   = m;
        }
    }

    Stack<Pair> s;

    // first val -  value
    // second value  -  min
    public MinStack() {
        s = new Stack<>();
    }
    
    public void push(int val) {
        if(s.isEmpty()){
            s.push(new Pair(val,val));
        }else{
            Pair p = new Pair(val, Math.min(s.peek().min,val));
            s.push(p);
        }
        
    }
    
    public void pop() {
        s.pop();
    }
    
    public int top() {
        return s.peek().value;
    }
    
    public int getMin() {
        return s.peek().min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */