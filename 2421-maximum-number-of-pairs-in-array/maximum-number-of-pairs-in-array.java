class Solution {

    public int[] numberOfPairs(int[] nums) {
        int[] ls = new int[101];

        for (var i : nums)
            ls[i]++;

        var distinct = 0;
        var pairs = 0;

        for (var i : ls) {
            pairs += i / 2;
            distinct += i % 2;
        }

        return new int[] { pairs, distinct };
    }
}
