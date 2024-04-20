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
        int left = 1, right = n;
        int pick = (right-left)/2; 

        while (left <= right) {
            pick = left + (right - left) / 2; 
            int guess = guess(pick);

            if (guess == 1) {
                left = pick + 1;
            } else  if (guess == -1) {
                right = pick - 1;
            } else if (guess == 0) {
                return pick;
            }
        }

         return -1;
    }
}