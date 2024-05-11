class Solution {
    public int lastStoneWeight(int[] stones) {
        //think of bashing stones,
        //so if we have stone of 4 and smash it vs 2 and then we have 2
        //if we have stone 5 and we bash vs 4 then we have 1
        PriorityQueue<Integer> heap = new PriorityQueue<>(
             (a, b) -> Integer.compare(b, a)
        );
        for (int i : stones)  heap.offer(i);

        while(heap.size() > 1) {
            int t = heap.poll() - heap.poll();
            heap.offer(t);
        }

        return heap.poll();

    }
}