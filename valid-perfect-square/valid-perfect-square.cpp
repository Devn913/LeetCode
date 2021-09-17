class Solution {
public:
    bool isPerfectSquare(int num) {
        int left = 1;
        int right = 100000;
        while(left<=right){
            long mid = left + (right-left)/2;
            if((int)mid*mid==num){
                return true;
            }else if((int)mid*mid>num){
                right = mid -1;
            }else{
                left = mid +1;
            }
        }
        return false;
    }
};