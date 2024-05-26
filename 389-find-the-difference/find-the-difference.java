class Solution {
    public char findTheDifference(String s, String t) {
        //I this method be slow, perhaps, hashmap would be faster.
        
        char[] tArray = s.toCharArray();
        char[] sArray = t.toCharArray();
        Arrays.sort(tArray);
        Arrays.sort(sArray);
        for (int i = 0; i < tArray.length; i++) {
            if (tArray[i] != sArray[i])
                return sArray[i];
        }

        return sArray[sArray.length - 1];
    }
}