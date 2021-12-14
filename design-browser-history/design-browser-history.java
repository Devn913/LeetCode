class BrowserHistory {
    public Stack<String> future;
    public Stack<String> history;
    int size = 1;
    public BrowserHistory(String homepage) {
        history=new Stack<String>();
        history.push(homepage);
        future = new Stack<String>();
    }
    
    public void visit(String url) {
        history.push(url);
        future = new Stack<String>();
        size++;
    }
    
    public String back(int steps) {
        while(steps>0 && size>1){
            future.push(history.peek());
            history.pop();
            --steps;
            size--;
        }
        return history.peek();
    }
    
    public String forward(int steps) {
        while(steps>0 && !future.empty()){
            history.push(future.peek());
            future.pop();
            --steps;
            size++;
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */