class Solution {
    public int maxNumberOfBalloons(String text) {
        //Runetime 92- 99%, Memory 50-60%
        char[] array = new char[255];

        for (char c : text.toCharArray()) 
            array[c - 'a']++;

        int result = Math.min(array['b' - 'a'], array['a' - 'a']);
        result = Math.min(result, array['n' - 'a']);
        result = Math.min(result, array['o' - 'a']/2);
        result = Math.min(result, array['l' - 'a']/2);

        return result;
    }
}