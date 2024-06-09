class Solution {

    public String reverseWords(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] array = s.toCharArray();
        char t = 'a';

        while (l < r) {
            t = array[l];
            array[l] = array[r];
            array[r] = t;
            l++;
            r--;
        }

        String[] sR = String.copyValueOf(array).split(" ");

        String returnS = "";
        for (int i = sR.length - 1; i >= 0; i--) {
            if (i != 0)
            returnS += sR[i] + " "; 
            else 
            returnS += sR[i]; 
        }

        //this is going to be very slow and bad space complexity

        return returnS;
    }
}
