class Solution {
    public int addDigits(int num) {
    int total;
     String s;

        while (num > 9) {
         total = 0;

        for (char c : String.valueOf(num).toCharArray()) {
            total += c - '0';
        }

        num = total;
        }

        return num;
    }
}