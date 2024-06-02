class Solution {

    public String reverseWords(String s) {
        String[] split = s.split(" ");
        String v = "";
        String r = "";

        for (int i = 0; i < split.length; i++) {
            for (int j = split[i].length() - 1; j >= 0; j--) {
                v += split[i].charAt(j);
            }
            split[i] = v;
            v = "";

            if (i < split.length - 1)
            r += split[i] + " ";
            else 
            r += split[i];
        }

        return r;
    }
}
