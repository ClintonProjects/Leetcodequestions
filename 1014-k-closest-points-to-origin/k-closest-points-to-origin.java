class Solution {

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));

        for (int[] i : points) {
            pq.offer(i);
            if (pq.size() > k) pq.poll();
        }

        return pq.toArray(new int[k][2]);
    }
}
