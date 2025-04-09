class Solution {
    // [[1,2],[3,2],[2]]]
    public int maxPoints(int[][] points) {
        int ans = 0;
        for(int i = 0;i<points.length;i++){
            HashMap<Double,Integer> map = new HashMap<>();
            int inf = 0;
            for(int j = 0;j<points.length;j++){
                if(i==j) continue;
                double dx = points[j][0] - points[i][0];
                double dy = points[j][1] - points[i][1];
                double slope = 0;
                if(dx == 0){
                    
                    ans = Math.max(ans,++inf);
                }else{
                    slope =  (dy)/(dx);
                    map.put(slope,map.getOrDefault(slope,0)+1);
                    ans = Math.max(ans,map.get(slope));
                }
            }
        }
        return ans+1;
    }
}
// [0,0] -> [1,2^30]
