class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long val = mass;
        for(int i=0;i<asteroids.length;i++){
            if(val<asteroids[i]) return false;
            val+=asteroids[i];
        }
        return true;
    }
}