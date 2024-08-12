class Solution {

    public int[] numberOfPairs(int[] nums) {
        int[] ls = new int[101];

        for (int i : nums)
            ls[i]++;

        int distinct = 0;
        int pairs = 0;

        for (int i : ls) {
            pairs += i / 2;
            distinct += i % 2;
        }

        return new int[] { pairs, distinct };
    }
}
