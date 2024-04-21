class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle.length() > haystack.length()){
            return -1;
        }

        int start;
        int end;
        start = 0;
        end = needle.length()-1;
        String s;

        while(end < haystack.length()) {
            s = haystack.substring(start, end + 1);
              if (s.equals(needle))
              return start;
              start++;
              end++;
        }

  
        return -1;
    }
}