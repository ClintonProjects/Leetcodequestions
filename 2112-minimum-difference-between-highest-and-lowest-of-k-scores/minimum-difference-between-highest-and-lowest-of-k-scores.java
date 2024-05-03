class Solution {
    public int minimumDifference(int[] nums, int k) {
        int val = Integer.MAX_VALUE;
        int l = 0;
        k = k -1;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - k; i++) {
           val = Math.min(val,  nums[i+k] - nums[i]);
        }

        return val;
    }
}