class Solution {
    class Pair{
        public int index;
        public int value;
        Pair(int i, int v){
            this.index   = i;
            this.value    = v;
        }
    }
    public int[] nextGreaterElements(int[] arr) {
        int[] list = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            list[i] = -1;
        }
        Stack<Pair> s = new Stack<>();
        int index = 0;
        while(index!=arr.length){
            if(s.isEmpty()) {
                s.push(new Pair(index,arr[index]));
                index++;
                continue;
            }
            while(!s.isEmpty() && s.peek().value<arr[index]){
                list[s.peek().index] = arr[index];
                s.pop();
            }
            s.push(new Pair(index,arr[index]));
            index++;
        }
        index = 0;
        while(index!=arr.length){
            if(s.isEmpty()) {
                s.push(new Pair(index,arr[index]));
                index++;
                continue;
            }
            while(!s.isEmpty() && s.peek().value<arr[index]){
                list[s.peek().index] = arr[index];
                s.pop();
            }
            s.push(new Pair(index,arr[index]));
            index++;
        }

        return list;
    }
}