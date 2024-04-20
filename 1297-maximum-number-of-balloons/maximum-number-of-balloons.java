class Solution {
    public int maxNumberOfBalloons(String text) {
        char[] array = new char[255];

        for (char c : text.toCharArray()) {
            array[c - 'a']++;
        }

        int temp = Math.min(array['b' - 'a'], array['a' - 'a']);
        temp = Math.min(temp, array['n' - 'a']);
        temp = Math.min(temp, array['o' - 'a']/2);
        temp = Math.min(temp, array['l' - 'a']/2);

        return temp;
        //b
        //a
        //l
        //o
        //s


    }
}