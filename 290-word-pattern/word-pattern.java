class Solution {

    public boolean wordPattern(String pattern, String s) {
        String str[] = s.split(" ");

        if (str.length != pattern.length()) return false;

        // int[] map1 = new int[256];
        // int[] map2 = new int[256];
        Map<String, Character> map1 = new HashMap<>();
        Map<Character, String> map2 = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            char c = pattern.charAt(i);
            String st = str[i];

            if (map1.containsKey(st) && map1.get(st) != c) return false;

            if (map2.containsKey(c) && !map2.get(c).equals(st)) return false;

            map1.put(st, c);
            map2.put(c, st);

            // char c = pattern.charAt(i);
            // char e = str[i].charAt(0);

            // if (map1[c] != 0 && map1[c] != e) return false;
            // if (map2[e] != 0 && map2[e] !=  c) return false;

            // map1[c] = e;
            // map2[e] = c;
        }

        return true;
    }
}
