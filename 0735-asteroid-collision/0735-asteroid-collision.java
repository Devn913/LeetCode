class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> s = new Stack<>();
        int index = 0;
        while(index<asteroids.length){
            if(s.isEmpty()){
                s.push(asteroids[index]);
                index++;
                continue;
            }
            if(s.peek() * asteroids[index] < 0 ){
                if(s.peek()< 0 && asteroids[index]>0){
                    s.push(asteroids[index]);
                    index++;
                }else if(s.peek() >0 && asteroids[index] < 0 ){
                    if(Math.abs(s.peek()) > Math.abs(asteroids[index])){
                        index++;
                    }else if(Math.abs(s.peek()) < Math.abs(asteroids[index])){
                        s.pop();
                    }else{
                        s.pop();
                        index++;
                    }
                }
            }else{
                s.push(asteroids[index]);
                index++;
            }

        }
        int[] result = new int[s.size()];
        for(int i = 0;i<result.length;i++){
            result[result.length - i - 1] = s.pop();
        } 
        return result;
    }
}