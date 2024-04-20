class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
        return true;


        int point = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(point))
            point++;

            if (point == s.length())
            return true;
        }

        return false;
    }
}