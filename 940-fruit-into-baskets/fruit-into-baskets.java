class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int start = 0;
        int end = 0;
        int max = 0;
        int e = 0;
        

        while (end < fruits.length && start < fruits.length ) {
            int i = fruits[start];
            int j = fruits[end];
            int amount = 0;

            map.put(j,map.getOrDefault(j,0)+1);

            while (map.size() > 2) {
                e = map.get(i);
                map.put(i, --e);
                if (e == 0) {
                    map.remove(i);
                }
                start++;
                i = fruits[start];
            }
                        
            max = Math.max(end - start + 1, max);
            end++;   
        }

        return max;
    }
}