import java.math.BigInteger;

class Solution {
    public String addStrings(String num1, String num2) {
        // I'll do this the way it's meant to be done after:
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        return n1.add(n2).toString();
    }
}