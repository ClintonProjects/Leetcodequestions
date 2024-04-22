class Solution {

    public int characterReplacement(String s, int k) {
        int l = 0, r = 0, highest = 0, count = 0;
        int[] cArr = new int[26];

        while (r < s.length()) {
            cArr[s.charAt(r) - 'A']++;
            count = 0;

            for (int i : cArr) count = Math.max(count, i);

            if ((r - l) - count + 1 <= k) {
            highest = Math.max(r - l + 1, highest); 
            } else {
                while (r-l - count >= k) {
                    cArr[s.charAt(l) - 'A']--;
                    l++;
                }
            }

            r++;
        }

        return highest;
    }
}
