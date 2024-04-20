class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int N = numbers.length - 1;
        int right = N;
        

        while (left < right) {
            int cur = numbers[left] + numbers[right];
            if (cur < target) {
                left++;
            } else if (cur > target) {
                right--;
            } else {
                return new int[] {left + 1, right + 1};
            }
        }

        return null;
    }
}