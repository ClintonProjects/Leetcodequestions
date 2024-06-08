class Solution {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> (a.getValue() - b.getValue()));

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        while (!pq.isEmpty() && k != 0) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            int key = entry.getKey();
            int value = entry.getValue();

            if (entry.getValue() <= k) {
                k -= entry.getValue();
            } else {
                pq.add(entry);
                break;
            }
        }

        return pq.size();
    }
}
