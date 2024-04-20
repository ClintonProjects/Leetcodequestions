class Solution {

    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (map.containsKey(i)) return true;
            map.put(i, i);
         }


        //good memory slow run time
        // Arrays.sort(nums);

        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i-1] == nums[i])
        //     return true;
        // }

        // return false;

        //bad memory good run time
        // Set<Integer> hs = new HashSet<>();

        // for (int i : nums) 
        // if (!hs.add(i)) return true;
        
        return false;
    }
}
