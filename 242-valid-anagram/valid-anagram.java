class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) 
        return false;
        
        char[] word1 = new char[255];
        char[] word2 = new char[255];

        for (int i = 0; i < s.length(); i++) {
            word1[s.charAt(i) - 'a']++;
            word2[t.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 255; i++) {
            if (word1[i] != word2[i])
            return false;
        }
        
        //  for (int i = 0; i < s.length(); i++) {
        //     word1[s.charAt(i) - 'a']++;
        //     word1[t.charAt(i) - 'a']--;
        // }

        // for (int i : word1) {
        //     if (i != 0) return false;
        // }
        
        return true;
    }
}