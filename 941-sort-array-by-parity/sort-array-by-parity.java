class Solution {

    public int[] sortArrayByParity(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l < r) {
            int rNum = nums[r];
            int lNum = nums[l];
            int temp = rNum;

            if (rNum % 2 == 0 && lNum % 2 == 1) {
                nums[r] = lNum;
                nums[l] = rNum;
                l++;
                r--;
            }

            if (nums[r] % 2 == 1) 
                r--;

            if (nums[l] % 2 == 0) 
                l++;
        }

        return nums;
    }
}
