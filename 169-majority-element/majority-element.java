class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;

        for (int i : nums) {
            if (count == 0) {
                result = i;
            }

            if (i == result) {
                count++;
            } else {
                count--;
            }
        }


        return result;

    }
}