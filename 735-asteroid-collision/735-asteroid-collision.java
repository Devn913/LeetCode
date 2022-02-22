class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i<asteroids.length){
            int val = asteroids[i];
            if(s.isEmpty()){
                s.push(val);
                i++;
                continue;
            }
            else if(s.peek()>0 && val<0){
                while(!s.isEmpty()){
                    if(s.peek() + val == 0){
                        s.pop();
                        i++;
                        break;
                    }else if(s.peek()>-val){
                        i++;
                        break;
                    }else if(s.peek()<0 && val<0){
                        // s.push(val);
                        break;
                    }else{
                        s.pop();
                    }
                }
                continue;
            }
            s.push(val);
            i++;
        }
        int[] res = new int[s.size()];
        for(i = res.length - 1;i!=-1;i--){
            res[i] = s.pop();
        }
        return res;
    }
}