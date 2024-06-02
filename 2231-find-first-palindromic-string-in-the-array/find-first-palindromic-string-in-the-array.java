class Solution {
    public String firstPalindrome(String[] words) {
        String palindrome = "";
        char[] cArray = new char[25];
        int l, r;

        for (String s : words) {
            l = 0;
            r = s.length() - 1;
            
            while(l <= r) {
                char c1 = s.charAt(l);
                char c2 = s.charAt(r);
                if (c1 != c2)
                break;
                l++;
                r--;
            }

            if (l >= r) {
                palindrome = s;
                break;
            }
        }

        return palindrome;
    }
}