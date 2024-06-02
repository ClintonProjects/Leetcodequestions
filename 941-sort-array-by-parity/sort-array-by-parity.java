class Solution {
    public int[] sortArrayByParity(int[] nums) {
        //I am aware two pointers would be faster, but just this way for fun.

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(
            (a,b) -> (a % 2) - (b % 2)
        );

        for (int i : nums) {
            pq.add(i);
        }

        int[] n = new int[nums.length];

        int counter = 0;

        while(!pq.isEmpty()) {
            n[counter++] = pq.poll();
        }

        return n;

    }
 }