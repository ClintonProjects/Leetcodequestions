class Solution {

    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        // if (nums.length <= 2) {
        //     return nums[nums.length - 1];
        // }

        int counter = 1;
        int index = nums.length - 2;

        while (counter < 3 && index >= 0) {
            if (nums[index + 1] != nums[index]) counter++;
            index--;
        }

        return counter == 3 ? nums[index+1] : nums[ nums.length - 1];
    }
}
