class Solution {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i])
            return true;
        }

        return false;


        // Set<Integer> hs = new HashSet<>();

        // for (int i : nums) 
        // if (!hs.add(i)) return true;
        
        // return false;
    }
}
