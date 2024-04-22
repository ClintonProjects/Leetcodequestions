class Solution {

    public int removeDuplicates(int[] nums) {
        int l = 0, r = 0;

        HashSet<Integer> hs = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!hs.add(nums[i])) nums[i] = -101;
        }

        while (r < nums.length) {
            if (nums[l] != -101) {
                l++;
                r=l;
            } else if (nums[l] == -101 && nums[r] != -101) {
                nums[l] = nums[r];
                nums[r] = -101;
            }

            r++;
        }


        return hs.size();
    }
}
