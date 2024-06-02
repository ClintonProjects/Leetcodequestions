class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;
        int temp;

        while (l < r) {
            temp = nums[r];

            if (nums[r]  % 2 == 0 && nums[l] % 2 == 1) {
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
                r--;
            }

            if (nums[r] % 2 == 1) r--;
            if (nums[l] % 2 == 0) l++;
        }

        return nums;
    }
}
