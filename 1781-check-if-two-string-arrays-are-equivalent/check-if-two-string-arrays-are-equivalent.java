class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        //this will be slow just making sure I understand the question
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String s3 : word1) {
            sb.append(s3);
        }

        for (String s3 : word2) {
            sb2.append(s3);
        }

        return sb.toString().equals(sb2.toString());
    }
}
