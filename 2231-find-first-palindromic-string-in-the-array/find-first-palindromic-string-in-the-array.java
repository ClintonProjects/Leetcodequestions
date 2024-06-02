class Solution {
    public String firstPalindrome(String[] words) {
        //lowering space complexity before I work run time

        String palindrome = "";
        int l, r;
        char c1, c2;

        for (String s : words) {
            l = 0;
            r = s.length() - 1;
            
            while(l <= r) {
                c1 = s.charAt(l);
                c2 = s.charAt(r);
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