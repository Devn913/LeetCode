class Solution {
    public int maxPoints(int[][] points) {
        int ans = 0;
        for(int i = 0;i<points.length;i++){
            HashMap<Double,Integer> map = new HashMap<>();
            for(int j = 0;j<points.length;j++){
                if(i == j) continue;

                int dy = points[j][1] - points[i][1];
                int dx = points[j][0] - points[i][0];
                double slope = 0.0;
                if(dx == 0){
                    slope = Double.MAX_VALUE;
                }else{
                    slope = (dy*1.0)/dx;
                }
                map.put(slope,map.getOrDefault(slope,0)+1);
                ans = Math.max(ans,map.get(slope));
            }
        }
        return ans+1;
    }
}