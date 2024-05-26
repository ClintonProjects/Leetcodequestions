import java.math.BigInteger;

class Solution {

    public String addStrings(String num1, String num2) {
        int l = num1.length() - 1, r = num2.length() - 1;
        StringBuilder result = new StringBuilder();
        int current = 0;
        boolean carry = false;
        int a = 0 , b = 0;

        while (l >= 0 || r >= 0 || carry) {
            a = 0; 
            b = 0;

            if (l >= 0) a = num1.charAt(l) - '0';
            if (r >= 0) b = num2.charAt(r) - '0';
            

            current = carry ? a + b + 1 : a + b;
            carry = false;

            carry = current >= 10;
            result.append(current % 10);
            current = 0;
            l--;
            r--;
        }

        return result.reverse().toString();
    }
}
