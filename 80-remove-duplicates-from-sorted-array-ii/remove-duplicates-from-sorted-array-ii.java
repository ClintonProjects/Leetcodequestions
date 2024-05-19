class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int cur = 0;
        int prev = Integer.MAX_VALUE;
        int changes = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != prev) {
                prev = nums[i];
                cur = 0;
            }

            cur++;
            
            if (cur > 2) {
                nums[i] = Integer.MAX_VALUE; 
                changes++;
            }
        }

        Arrays.sort(nums);
        
        return nums.length - changes;
    }
}