import java.math.BigInteger;

class Solution {
    public int arraySign(int[] nums) {
        BigInteger bd = new BigInteger("1");
        for (int i : nums) 
            bd = bd.multiply(new BigInteger(String.valueOf(i)));

        if (bd.compareTo(BigInteger.ZERO) > 0) {
            return 1;
        } else if (bd.compareTo(BigInteger.ZERO) == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}