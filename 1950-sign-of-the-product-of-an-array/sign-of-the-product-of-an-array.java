import java.math.BigInteger;

class Solution {

    public int arraySign(int[] nums) {
        int cur = 1; // this of number 1 not multiplying the numbers.
        for (int i : nums) {
        if (i == 0) cur *= 0; 
        else if (i > 0) cur *= 1; 
        else if (i < 0) cur *= -1; 
        }

        return cur;
    }
}
