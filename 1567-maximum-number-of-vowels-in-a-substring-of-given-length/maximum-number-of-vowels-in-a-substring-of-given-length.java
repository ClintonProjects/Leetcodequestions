class Solution {
    public int maxVowels(String s, int k) {
        int[] cArray = new int[255];

        int start = 0;
        int end = k;
        int max = 0;
        char starting;
        char ending;

        for (int i = 0; i < k; i++) {
            cArray[s.charAt(i) - 'a']++;
            max = Math.max(max, getValAmount(cArray));
        }

        for (int i = k; i < s.length(); i++) {
            starting = s.charAt(start);
            ending = s.charAt(end);

            cArray[starting - 'a']--;
            cArray[ending - 'a']++;

            max = Math.max(max, getValAmount(cArray));

            start++;
            end++;
        }

        return max;
    }

    public int getValAmount(int[] cArray) {
        return cArray['a' - 'a'] + cArray['e' - 'a'] + cArray['i' - 'a'] + cArray['o' - 'a'] + cArray['u' - 'a'];
    }

}