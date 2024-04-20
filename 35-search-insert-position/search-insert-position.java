class Solution {
    public int searchInsert(int[] nums, int target) {
            int a = 0;
            int N = nums.length - 1;
            int b = N;
            
            while (a <= b) {
                int middle = a + (b - a) / 2;
                int val = nums[middle];
                if (val == target)
                return middle;
                else if (val < target) 
                a = middle + 1;
                else if (val > target) 
                b = middle - 1;
            }

            return a;
    }
}