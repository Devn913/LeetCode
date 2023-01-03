class LRUCache {
    
    class Node{
        Node next;
        Node prev;
        int val;
        int key;
        Node(int key,int data){
            this.key = key;
            this.val = data;
            next = null;
            prev = null;
        }
    }
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    int size;
    int currentSize;
    /* add after head */
    private void add(Node node){
        Node prev = head;
        Node next = head.next;

        node.next = next;
        node.prev = prev;

        prev.next = node;
        next.prev = node;
    }
    /* remove before tail */
    private void remove(){
        Node node = tail.prev;
        Node prev = node.prev;

        tail.prev = prev;
        prev.next = tail;
        
    }
    private void remove(Node node){
        Node next = node.next;
        Node prev = node.prev;

        node.next = null;
        node.prev = null;

        prev.next = next;
        next.prev = prev;

    }
    


    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new Node(-11,-11);
        tail = new Node(-11,-11);
        head.next = tail;
        tail.prev = head;
        size = capacity;
        currentSize = 0;
    }
    
    public int get(int key) {
        if(!map.containsKey(key)) return -1;
        Node node = map.get(key);
        int val = node.val;
        remove(node);
        map.remove(key);
        currentSize--;
        put(key,val);
        return val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            map.remove(key);
            remove(node);
            currentSize--;
        }
        if(currentSize==size){
            currentSize--;
            int key2 = tail.prev.key;
            remove();
            map.remove(key2);
        }
        Node node = new Node(key,value);
        map.put(key,node);
        currentSize++;
        add(node);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */