class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        int sum = 0;
        Set<List<Integer>> distinctList = new HashSet<>();
        List<List<Integer>> setter = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int left = 0; left < nums.length - 2; left++) {
            int middle = left + 1;
            int right = nums.length - 1;

            while (middle < right) {
                sum = nums[left] + nums[middle] + nums[right];
                if (sum == 0) {
                    distinctList.add(new ArrayList<Integer>(Arrays.asList(nums[left], nums[middle], nums[right])));
                    middle++;
                    right--;
                } else if (sum < 0) {
                    middle++;
                } else {
                    right--;
                }
            }
        }

        setter.addAll(distinctList);

        return setter;
    }
}
