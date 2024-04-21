class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ls = new LinkedList<Integer>();

        for (int i : nums)
            map.put(i,i);

        for (int i = 1; i <= nums.length; i++) 
            if (!map.containsKey(i))
            ls.add(i);
        

        return ls;
    }
}