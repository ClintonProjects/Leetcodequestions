class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        List<List<Integer>> setter = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        int middle = 0;
        int right = 0;

        for (int left = 0; left < nums.length - 2; left++) {
             if (left > 0 && nums[left] == nums[left - 1]) {
                continue;
            }

            middle = left + 1;
            right = nums.length - 1;

            while (middle < right) {
                sum = nums[left] + nums[middle] + nums[right];
                if (sum == 0) {
                    setter.add(new ArrayList<Integer>(Arrays.asList(nums[left], nums[middle], nums[right])));
                    middle = middle(nums, middle, right);
                    right = right(nums, right, middle);
                    middle++;
                    right--;
                } else if (sum < 0) {
                    middle++;
                } else {
                    right--;
                }
            }
        }

        return setter;
    }

    public int middle(int[] nums, int currentIndex, int max) {
        while (currentIndex < max && nums[currentIndex] == nums[currentIndex + 1]) {
            currentIndex++;
        }
        return currentIndex;
    }

    public int right(int[] nums, int currentIndex, int lowerbound) {
        while (lowerbound < currentIndex && nums[currentIndex] == nums[currentIndex - 1]) {
            currentIndex--;
        }
        return currentIndex;
    }
}
