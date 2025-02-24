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
        long start = 1;
        long end = n;
        while(start < n) {
            long mid = (start + end)/2;
            int guess = guess((int) mid);
            if(guess == 0) return (int) mid;

            if(guess == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return (int) start;
    }
}