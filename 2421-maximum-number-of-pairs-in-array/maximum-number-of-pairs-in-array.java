class Solution {

    public int[] numberOfPairs(int[] nums) {
        int[] ls = new int[101];

        for (var i : nums)
            ls[i]++;

        int[] r = new int[2];

        for (var i : ls) {
            r[0] += i / 2;
            r[1] += i % 2;
        }

        return r;
    }
}
