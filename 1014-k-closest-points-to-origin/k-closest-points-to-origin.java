class Solution {

    public int[][] kClosest(int[][] points, int k) {
        // p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
         );

        for (int[] i : points) {
            pq.offer(i);
            if (pq.size() > k)
            pq.poll();
        }

        int[][] results = new int[k][2];

        for (int i = 0; i < results.length; i++) {
            results[i] = pq.poll();
        }

        return results;
    }
}
