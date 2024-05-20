class Solution {
    public int[] sortedSquares(int[] nums) {
        final int N = nums.length;
        int left = 0, right = N - 1,  resultArray = N - 1;
        int[] result = new int[N];
        
        while (left <= right) {
            if (sum(nums[left]) < sum(nums[right])) {
                result[resultArray--] =  sum(nums[right]); 
                right--;
            } else {
                result[resultArray--] = sum(nums[left]); 
                left++;
            }
        }

        return result;
    }

    public int sum(int num) {
        return Math.abs(num * num);
    }
}


        // for(int i = 0; i < nums.length; i++) 
        // nums[i] = Math.abs(nums[i] * nums[i]);
        
        // Arrays.sort(nums);
        // return nums;