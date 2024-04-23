class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            int N = nums[i];
            nums[i] = Math.abs(N * N);
        }
        Arrays.sort(nums);
        return nums;
    }


    
}