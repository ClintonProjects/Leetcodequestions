import java.math.BigInteger;

class Solution {

    public String addStrings(String num1, String num2) {
        int l = num1.length() - 1, r = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int current = 0;
        boolean carry = false;

        while (l >= 0 || r >= 0 || carry) {
            if (l >= 0) {
                current += num1.charAt(l) - '0';
                l--;
            }

            if (r >= 0) {
                current += num2.charAt(r) - '0';
                r--;
            }

            if (carry) {
                current = current + 1;
                carry = false;
            }

            if (current >= 10) {
                current -= 10;
                carry = true;
            }

            result.insert(0, current);
            current = 0;
        }

        return result.toString();
    }
}
