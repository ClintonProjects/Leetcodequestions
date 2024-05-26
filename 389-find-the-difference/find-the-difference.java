class Solution {

    public char findTheDifference(String s, String t) {
        //I this method be slow, perhaps, hashmap would be faster.

        char[] tArray = s.toCharArray();
        char[] sArray = t.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < tArray.length; i++) {
            map.put(tArray[i], map.getOrDefault(tArray[i], 0) + 1);
            if (i < sArray.length) {
                map.put(sArray[i], map.getOrDefault(sArray[i], 0) - 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char character = entry.getKey();
            int count = entry.getValue();
            if (count <= -1) {
                return character;
            }
        }


        return sArray[sArray.length - 1];
    }
}
