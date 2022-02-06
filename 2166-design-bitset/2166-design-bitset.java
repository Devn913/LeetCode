class Bitset {
    boolean[] set;
    boolean isFlipped;
    int count1;
    public Bitset(int size) {
        set = new boolean[size];
        for(int i=0;i<size;i++) set[i] = true;
        isFlipped = false;
        count1 = 0;
    }
    
    public void fix(int idx) {
        if(isFlipped){
            if(set[idx] == false){
                set[idx] = true;
                count1++;
            }
        }else{
            if(set[idx] == true){
                set[idx] = false;
                count1++;
            }
        }
    }
    
    public void unfix(int idx) {
        if(!isFlipped){
            if(set[idx] == false){
                set[idx] = true;
                count1--;
            }
        }else{
            if(set[idx] == true){
                set[idx] = false;
                count1--;
            }
        }
    }
    
    public void flip() {
        isFlipped = !isFlipped;
        count1 = set.length - count1;
    }
    
    public boolean all() {
        return count1 == set.length;
    }
    
    public boolean one() {
        return count1>=1;
    }
    
    public int count() {
        return count1;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder(set.length);
        if(isFlipped){
            
            for(int i = 0;i<set.length;i++){
                if(set[i]){
                    sb.append("1");
                }else{
                    sb.append("0");
                }
            }
        }else{
            for(int i = 0;i<set.length;i++){
                if(set[i]){
                    sb.append("0");
                }else{
                    sb.append("1");
                }
            }
        }
        return sb.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */