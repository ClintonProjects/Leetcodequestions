class Solution {
    public int arrangeCoins(int n) {
        int blocks = 1;

        while (0 < n) {
            n -= blocks;
            if (n - blocks > 0)
            blocks += 1;
        }


        return blocks;
    }

    public int recursion(int current, int total, int ill) {
        if (total < 0)
         return ill;
        else
         return recursion(current+1, total - current, ill + 1);
    }   
}