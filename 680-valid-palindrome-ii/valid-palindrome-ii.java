class Solution {
    public boolean validPalindrome(String s) {
         int l = 0;
         int r = s.length() - 1;
         Set<Character> set = new HashSet<>();
         boolean check = false;

         while(l < r) {
            char c = s.charAt(l);
            char c2 = s.charAt(r);

            if (c == c2) {
                l++;
                r--;
            } else {
               return isPala(s, l + 1, r) || isPala(s, l, r - 1); 
            }
         }



		return true;
    }

    public boolean isPala(String s, int l, int r) {
            while(l < r) {
            char c = s.charAt(l);
            char c2 = s.charAt(r);

            if (c == c2) {
                l++;
                r--;
            } else {
                return false;
            }
         }
        
        return true;
    }
}