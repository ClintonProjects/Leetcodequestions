class Solution {
    public int longestPalindrome(String s) {
        if (s.length() < 1 || s == null) {
            return 0;
        }

        if (s.length() == 1) {
            return 1;
        }

        int[] cArray = new int[255];

        for (char c : s.toCharArray()) {
            cArray[c - 'A']++;
        }

        int result = 0;
        boolean e = false;

        for (int c : cArray) {
            result +=  c / 2;
            if (c % 2 == 1)
            e = true;
        }

        result *= 2;

        if (e) result += 1;

        return result;
    

    }
}