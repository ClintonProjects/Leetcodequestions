class Solution {
    public int strStr(String haystack, String needle) {
        int N = haystack.length();
        int M = needle.length();

        if (haystack == null || M > N)
            return -1;

        int start = 0, end = needle.length()-1;
        String s;

        while(end < N) {
             s = haystack.substring(start, end + 1);
              if (s.equals(needle))
              return start;
              start++;
              end++;
        }

        return -1;
    }
}