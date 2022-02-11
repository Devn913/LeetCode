class RandomizedSet {
    public HashMap<Integer,Integer> map;
    public HashMap<Integer,Integer> reverse;
    int range;
    public RandomizedSet() {
        map = new HashMap<>();
        reverse = new HashMap<>();
        range = 0;
    }
    
    public boolean insert(int val) {
        if(reverse.containsKey(val)) return false;
        map.put(range,val);
        reverse.put(val,range);
        range++;
        return true;
    }
    
    public boolean remove(int val) {
        if(!reverse.containsKey(val)) return false;
        int rangeVal = reverse.get(val);
        reverse.remove(val);
        if(rangeVal!=range - 1){
            int value = map.get(range-1);
            map.put(rangeVal,value);
            reverse.put(value,rangeVal);
        }else{
            map.remove(rangeVal);
        }
        range--;
        return true;
    }
    
    public int getRandom() {
        int random = (int) (Math.random() * (range));
        return map.get(random);

    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */