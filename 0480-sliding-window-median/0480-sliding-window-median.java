class Solution {
    public class Pair implements Comparable<Pair>{
        long val;
        double noise;
        Pair(long val, double random) {
            this.val = val;
            this.noise = random;
        }
        
        public int compareTo(Pair p){
            if(this.val == p.val){
                return Double.compare(this.noise,p.noise);
            }
            return Long.compare(this.val,p.val);
        }
    }
    public double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        double[] ans = new double[n-k+1];

        if(k == 1){
            for(int i = 0;i<n;i++){
                ans[i] = nums[i];
            }
            return ans;
        }
        TreeSet<Pair> left = new TreeSet<>();
        TreeSet<Pair> right = new TreeSet<>();
        int index = 0;
        int min = Integer.MIN_VALUE;
        while(index<k){
            left.add(new Pair(nums[index],Math.random()));
            index++;
        }

        rebalance(left,right,k);
        


        ans[0] = getMedian(left,right, k);

        for(index = k;index<n;index++){
            remove(left,right,nums[index-k]);
            rebalance(left,right,k-1);

            add(left,right,nums[index],k);
            rebalance(left,right,k);
            ans[index-k+1] = getMedian(left,right,k);
            // if(index-k == 3) break;
        }

        while(left.size()!=0){
            Pair p = left.first();
            System.out.print(p.val + " ");
            left.remove(p);
        }
        System.out.println();

        while(right.size()!=0){
            Pair p = right.first();
            System.out.print(p.val + " " );
            right.remove(p);
        }
        




        return ans;
    }

    public double getMedian(TreeSet<Pair> left, TreeSet<Pair> right, int k){
        if(k%2==0){
            return (left.last().val + right.first().val)/2.0;
        }else{
            return left.last().val;
        }
    }
    public void remove(TreeSet<Pair> left, TreeSet<Pair> right, int ele){
        if(left.last().val>=ele){
            Pair p = left.higher(new Pair(ele,-1));
            left.remove(p);
        }else{
            Pair p = right.higher(new Pair(ele,-1));
            right.remove(p);
        }
    }

    public void add(TreeSet<Pair> left, TreeSet<Pair> right, int ele, int k){
        if(left.last().val<ele){
            right.add(new Pair(ele,Math.random()));
        }else{
            left.add(new Pair(ele,Math.random()));
        }
    }

    public void rebalance(TreeSet<Pair> left, TreeSet<Pair> right, int k){
        if(k%2==0){
            rebalanceEven(left, right);
        }else{
            rebalanceOdd(left,right);
        }
    }

    public void rebalanceOdd(TreeSet<Pair> left, TreeSet<Pair> right){
        if(left.size()>right.size()){
            if(left.size()-right.size() == 1) return;
            else{
                while(left.size()-right.size() != 1){
                    Pair p = left.pollLast();
                    right.add(p);
                }
            }
        }else{
            while(left.size()-right.size() != 1){
                Pair p = right.pollFirst();
                left.add(p);
            }

        }
    }

    public void rebalanceEven(TreeSet<Pair> left, TreeSet<Pair> right){
        if(left.size()==right.size()) return;

        else if(left.size()>right.size()){
            while(left.size()-right.size() != 0){
                Pair p = left.pollLast();
                right.add(p);
            }

        }else{
            while(left.size()-right.size() != 0){
                Pair p = right.pollFirst();
                left.add(p);
            }

        }
    }
}