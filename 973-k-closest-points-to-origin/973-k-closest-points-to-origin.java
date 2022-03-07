class Solution {
    class pair implements Comparable<pair>{
        int x;
        int y;
        pair(int x, int y){
            this.x = x;
            this.y = y;
        }
        public int compareTo(pair p){
            return Double.compare(Math.sqrt(p.x*p.x + p.y*p.y) ,Math.sqrt(this.x*this.x + this.y*this.y));            
        }
        
    }
    public int[][] kClosest(int[][] points, int k) {
        if(points.length == 1) return points;
        PriorityQueue<pair> pq =new PriorityQueue<>();
        for(int i = 0;i<points.length;i++){
            pair p = new pair(points[i][0],points[i][1]);
            pq.add(p);
            if(pq.size()>k) pq.remove();
        }
        int[][] res = new int[k][2];
        for(int i = 0;i<k;i++){
            pair p =pq.remove();
            res[i][0] = p.x;
            res[i][1] = p.y;
        }
        return res;
    }
}