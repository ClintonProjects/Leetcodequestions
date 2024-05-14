class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

        for (int[] i : points) {
            pq.offer(i);
            if (pq.size() > k) pq.poll();
        }

        int[][] results = new int[pq.size()][2];
        int index = 0;
        while (!pq.isEmpty()) {
            results[index++] = pq.poll();
        }

        return results;
    }
}
