class Solution {

    public String mergeAlternately(String word1, String word2) {
        //boolean switch = false;
        int l = 0, r = 0;
        String result = "";
        while (l < word1.length() || r < word2.length()) {
            if ((r == l && l < word1.length()) || r == word2.length() && l != word1.length()) {
                result += word1.charAt(l);
                l++;
            } else if ((r < l && r < word2.length()) || l == word1.length() && r != word2.length()) {
                result += word2.charAt(r);
                r++;
            }
        }

        return result;
    }
}
