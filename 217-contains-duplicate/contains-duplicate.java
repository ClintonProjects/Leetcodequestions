class Solution {

    public boolean containsDuplicate(int[] nums) {
        // Not really in the middle.
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i : nums) {
        //     map.put(i, map.getOrDefault(i, 0) + 1);
        //     if (map.get(i) > 1) return true;
        //  }


        //good memory slow run time
        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i-1] == nums[i])
        //     return true;
        // }

        // return false;

        //bad memory good run time
        Set<Integer> hs = new HashSet<>();

        for (int i : nums) 
        if (!hs.add(i)) return true;
        
        return false;
    }
}
