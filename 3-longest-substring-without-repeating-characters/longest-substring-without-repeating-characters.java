class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> c = new HashSet<Character>();
        String longestString = "";
        int l = 0;
        int r = 0;
        int m = 0;

        while (r != s.length()) {
            if (!c.contains(s.charAt(r))) {
                c.add(s.charAt(r));
                m = Math.max(r - l + 1, m);
                r++;
            } else {
                c.remove(s.charAt(l));
				l++;
            }
        }

        return m;
    }
}