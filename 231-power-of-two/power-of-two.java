class Solution {

    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;

        long runner = 1;
        int count = 1;
        
        while (runner < n) runner = (long) Math.pow(2, count++);
        if (runner == n) return true;
        return false;
    }
}
