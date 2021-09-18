class Solution {
public:
    int climbStairs(int n) {
    if(n <=2){
        return n;
    }
    int n1 = 2;
    int n2 = 1;
    int res = 0;
    for(int i=2; i<n; i++){
    	res = n1 + n2;
    	n2 = n1;
        n1 = res;
    }
    return res;
    }
};