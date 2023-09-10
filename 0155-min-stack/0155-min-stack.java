class MinStack {
    
    class Node {
        int val;
        int min;
        Node(int val, int min){
            this.val = val;
            this.min = min;
        }
        
    }
    Stack<Node> s;
    int size;

    public MinStack() {
        s = new Stack<>();
        size = 0;
    }
    
    public void push(int val) {
        if(this.size == 0){
            Node node = new Node(val,val);
            s.push(node);
            this.size++;
        }else{
            int min = this.getMin();
            s.push(new Node(val,Math.min(val,min)));
            this.size++;
        }
    }
    
    public void pop() {
        this.size--;
        s.pop();
    }
    
    public int top() {
        return s.peek().val;
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