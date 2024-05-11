class Solution {
    public int lastStoneWeight(int[] stones) {
        //improving space complex
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(
             (a, b) -> Integer.compare(b, a)
        );

        for (int i : stones)  heap.offer(i);
        while(heap.size() > 1) heap.offer( heap.poll() - heap.poll());
        

        return heap.poll();

    }
}