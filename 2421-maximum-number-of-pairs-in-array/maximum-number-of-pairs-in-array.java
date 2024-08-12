class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        Stack<Integer> st = new Stack<Integer>();
        int pairs = 0;

        for (int i : nums) {
            if (st.isEmpty() || st.peek() != i) {
                st.push(i);
            } else {
                pairs++;
                st.pop();
            }
        }


        return new int[] {pairs, st.size()};
    }
}