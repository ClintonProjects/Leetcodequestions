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

            current = carry ? current + 1 : current;
            carry = false;

            carry = current >= 10;

            result.append(current % 10);
            current = 0;
        }

        return result.reverse().toString();
    }
}
