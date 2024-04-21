class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ls = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);

        for (int i : nums) set.add(i);

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
            ls.add(i);
        }
       
        

        return ls;
    }
}