class Solution {

    public char findTheDifference(String s, String t) {
        //done :)
        int result = 0;
        
         for (int i = 0; i < t.length(); i++) {
            if (s.length() > i)
            result -= s.charAt(i);
            result += t.charAt(i);
        }

        return (char) result;
    }
}
