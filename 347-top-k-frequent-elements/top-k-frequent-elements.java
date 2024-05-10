class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        LinkedList<Integer> l = new LinkedList<>(map.keySet());

        l.sort((a, b) -> map.get(b) - map.get(a));

        return l.stream()
                .limit(k)  
                .mapToInt(Integer::intValue)
                .toArray();
    }
}