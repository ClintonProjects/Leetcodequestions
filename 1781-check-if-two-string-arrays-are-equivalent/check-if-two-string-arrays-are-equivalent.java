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

        return s.equals(s2);
    }
}