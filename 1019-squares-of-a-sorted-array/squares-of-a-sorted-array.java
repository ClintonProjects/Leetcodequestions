class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int resultArray = nums.length - 1;
        int[] result = new int[nums.length];
        
        while (left <= right) {
            if (Math.abs(nums[left] * nums[left]) <  Math.abs(nums[right] * nums[right])) {
                result[resultArray--] =  Math.abs(nums[right] * nums[right]); 
                right--;
            } else {
                result[resultArray--] = Math.abs(nums[left] * nums[left]); 
                left++;
            }
        }

        return result;

        // for(int i = 0; i < nums.length; i++) 
        // nums[i] = Math.abs(nums[i] * nums[i]);
        
        // Arrays.sort(nums);
        // return nums;
    }


    
}