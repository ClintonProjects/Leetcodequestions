class Solution {

    public boolean isMonotonic(int[] nums) {
        boolean increasing = false, decreasing = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) {
                increasing = true;
            } else if (nums[i] > nums[i+1]) {
                decreasing = true;
            }

            if (decreasing && increasing)
            return false;
        }

        return true;
    }
}
