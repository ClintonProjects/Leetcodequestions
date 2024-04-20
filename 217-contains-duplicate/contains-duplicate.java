class Solution {

    public boolean containsDuplicate(int[] nums) {
        //not my code
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int num : nums) {
            if (seen.containsKey(num) && seen.get(num) >= 1)
                return true;
            seen.put(num, seen.getOrDefault(num, 0) + 1);
        }
        return false;


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
        
    }
}
