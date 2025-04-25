class Solution {
    class Pair implements Comparable<Pair>{
        int x;
        int y;
        double d;

        Pair(int x, int y, double d){
            this.x = x;
            this.y = y;
            this.d = d;
        }
        @Override
        public int compareTo(Pair p){
            return Double.compare(p.d,this.d);
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i = 0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];

            double d = Math.sqrt(x*x + y*y);
            pq.add(new Pair(x,y,d));

            if(pq.size()>k) pq.remove();
        }
        int[][] ans = new int[k][2];
        for(int i = 0;i<k;i++){
            Pair p = pq.remove();
            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }
        return ans;

        



        // Approach 1: Sorting entire points based on distance from origin.
        // Arrays.sort(points,(a,b)->Double.compare(
        //     Math.sqrt(a[0]*a[0] +a[1]*a[1]),
        //     Math.sqrt(b[0]*b[0] +b[1]*b[1])
        //     ));
        // int[][] ans = new int[k][2];
        // for(int i = 0;i<k;i++){
        //     ans[i][0] = points[i][0];
        //     ans[i][1] = points[i][1];
        // }
        // return ans;
        
    }
}