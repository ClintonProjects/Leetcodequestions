class Solution {
    public void reverseString(char[] s) {
        char r;
        for (int i = 0; i < s.length / 2; i++) {
            r = s[s.length-1 - i];
            s[s.length-1 - i] = s[i];
            s[i] = r;
        }
    }
}