class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arrayIndexL = 0, arrayIndexR = 0, i = 0, j = 0;

        while (arrayIndexL < word1.length && arrayIndexR < word2.length) {
            if (word1[arrayIndexL].charAt(i) != word2[arrayIndexR].charAt(j)) return false;

            if (i == word1[arrayIndexL].length() - 1) {
                arrayIndexL++;
                i = 0;
            } else {
                i++;
            }

            if (j == word2[arrayIndexR].length() - 1) {
                arrayIndexR++;
                j = 0;
            } else {
                j++;
            }
        }

        return arrayIndexL == word1.length && arrayIndexR == word2.length;
    }
}
