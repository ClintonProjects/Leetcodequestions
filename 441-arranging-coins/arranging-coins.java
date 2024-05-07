class Solution {

    public int arrangeCoins(int n) {
        return recursion(n, 1);
        // int blocks = 1;

        // while (0 < n) {
        // n -= blocks;
        // if (n - blocks > 0)
        // blocks += 1;
        // }

        // return blocks;
    }

    public int recursion(int n, int blocks) {
        if (n <= 0) return blocks;
        n -= blocks;
        if (n - blocks > 0) blocks += 1;
        return recursion(n, blocks);
    }
}
