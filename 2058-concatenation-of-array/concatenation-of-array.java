class Solution {
    public int[] getConcatenation(int[] nums) {
        int N = nums.length;
        int[] r = new int[N * 2];

        for (int i = 0; i < N; i++) {
            r[i] = nums[i];
            r[i + N] = nums[i];
        }

        return r;
    }
}