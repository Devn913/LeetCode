class Solution {
    public class Robot implements Comparable<Robot>{
        int position;
        int health;
        char direction;
        int index;
        public Robot(int p, int h, char d, int realIndex){
            position = p;
            health = h;
            direction = d;
            index = realIndex;
        }
        @Override
        public int compareTo(Robot r){
            return this.position - r.position ;
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> list = new ArrayList<>();
        for(int i =0;i<positions.length;i++){
            list.add(-1);
        }
        Robot[] r = new Robot[positions.length];
        for(int i = 0;i<positions.length;i++){
            r[i] = new Robot(positions[i],healths[i],directions.charAt(i),i);
        }
        Arrays.sort(r);
        Stack<Robot> answer = new Stack<>();
        int index = 0;
        while(index<r.length){
            if(answer.isEmpty()){ answer.push(r[index++]); continue;}
            if(answer.peek().direction =='R' && r[index].direction=='L'){
                if(answer.peek().health>r[index].health){
                    answer.peek().health-=1;
                    index++;
                }else if(answer.peek().health==r[index].health){
                    answer.pop();
                    index++;
                }else{
                    answer.pop();
                    r[index].health-=1;
                }
            }else{
                answer.push(r[index++]);
            }            
        }
        while(!answer.isEmpty()){
            list.set(answer.peek().index,answer.pop().health);
        }
        list.removeIf(element -> element == -1);
        // list.add(r[0].position);
        return list;
        
    }
}