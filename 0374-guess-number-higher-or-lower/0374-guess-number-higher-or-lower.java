/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = (int)(low+(high-low)/2);
            int isMid = guess(mid);
            if(isMid==0) return mid;
            else if(isMid==1){
                low = mid+1;
            } else{
                high = mid -1;
            }
        }
        return -1;
    }
}