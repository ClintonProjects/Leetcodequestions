class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (result == nums[i]) {
                count++;
            } else if (result != nums[i]) {
                count--;
            }

            if (count <= 0) {
                result = nums[i];
                count = 1;
            }
        }


        return result;

    }
}