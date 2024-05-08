class Solution {

    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int middle = 0, current;
        int start = -1, end = -1;

        while (left <= right) {
            middle = left + (right - left) / 2;
            if (nums[middle] < target) left = middle + 1; 
            else if (nums[middle] > target) right = middle - 1; 
            else if (nums[middle] == target) {
                start = middle;
                end = middle;
                while (start > 0 && nums[start - 1] == target) start--;
                while (end < nums.length - 1 && nums[end + 1] == target) end++;
                break;
            }
        }

        return new int[] { start, end};
    }

    public int findRange(int[] arr, int target, int currentIndex, int way) {
        while (currentIndex < arr.length && currentIndex >= 0) {
            if (target != arr[currentIndex]) {
                return currentIndex + (way * -1);
            } else {
                currentIndex += way;
            }
        }

        System.out.println(currentIndex);
        // error
        return currentIndex;
    }
}
