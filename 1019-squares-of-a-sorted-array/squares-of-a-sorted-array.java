class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int resultArray = nums.length - 1;
        int[] result = new int[nums.length];
        int ls = 0;
        int rs = 0;
        while (left <= right) {
            ls = Math.abs(nums[left] * nums[left]) ;
            rs =  Math.abs(nums[right] * nums[right]);
            if (ls < rs) {
                result[resultArray--] = rs; 
                right--;
            } else {
                result[resultArray--] = ls; 
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