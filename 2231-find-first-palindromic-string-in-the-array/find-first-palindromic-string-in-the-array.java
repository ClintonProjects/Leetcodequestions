class Solution {
    public String firstPalindrome(String[] words) {
        String palindrome = "";
        int l, r;

        for (String s : words) {
            l = 0;
            r = s.length() - 1;
            
            while(l <= r) {
                if (s.charAt(l) != s.charAt(r))
                break;
                l++;
                r--;
            }

            if (l >= r) {
                return s;
            }
        }

        return "";
    }
}