class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //this will be slow just making sure I understand the question

        String s = "";
        String s2 = "";

        for (String s3 : word1) {
            s += s3;
        }

        for (String s3 : word2) {
            s2 += s3;
        }

        if (s.length() != s2.length()) 
        return false;

        int i = 0,  j = 0;
        
        while(i < s.length() && j < s2.length()) {
            if (s.charAt(i++) != s2.charAt(j++))
            return false;
        }
        

        return true;
    }
}