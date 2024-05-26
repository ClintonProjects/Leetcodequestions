class Solution {
    public int addDigits(int num) {
    int total;
     String s;

        while (num > 9) {
         s = String.valueOf(num);
         total = 0;

        for (char c : s.toCharArray()) {
            total += c - '0';
        }

        num = total;
        }

        return num;
    }
}