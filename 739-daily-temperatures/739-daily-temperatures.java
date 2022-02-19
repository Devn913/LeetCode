class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<temperatures.length;){
            if(s.empty()) {
                s.push(i);
                i++;
            }
            if(i == temperatures.length) break;
            if(temperatures[s.peek()]>=temperatures[i]){
                s.push(i);
                i++;
            }else{
                res[s.peek()] = i - s.peek();
                s.pop();
                
            }
        }
        return res;
    }
}
