class Solution {

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int arrayIndexL = 0, arrayIndexR = 0;
        int i = 0, j = 0;
        char c, c2;

        while (arrayIndexL < word1.length) {
            if (i == word1[arrayIndexL].length()) {
                arrayIndexL += 1;
                i = 0;
            }

            if (j == word2[arrayIndexR].length()) {
                arrayIndexR += 1;
                j = 0;
            }

            if (arrayIndexL == word1.length || arrayIndexR == word2.length) break;

            c = word1[arrayIndexL].charAt(i);
            c2 = word2[arrayIndexR].charAt(j);

            if (c != c2) return false;

            i++;
            j++;
        }

        return arrayIndexL == word1.length && arrayIndexR == word2.length;
    }
}
