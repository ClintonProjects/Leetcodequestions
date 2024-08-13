class Solution {

    public int maximum69Number(int num) {
        int l = 0;
        char[] s = String.valueOf(num).toCharArray();
        int r = s.length - 1;

        for(int i =0; i < s.length; i++) {   
            if (s[i] == '6') {
                s[i] = '9';
                return Integer.valueOf(String.valueOf(s));
            }
        }

        return num;
    }
}
