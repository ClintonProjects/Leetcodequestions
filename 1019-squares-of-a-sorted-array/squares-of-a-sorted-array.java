class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            //not my code, last commit was
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }


    
}