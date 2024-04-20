class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int left = 0;
    int row = matrix.length;
    int col = matrix[0].length;
    int right = row * col - 1;

		while (left <= right) {
            int middle = left + (right - left) / 2;
            int midVal = matrix[middle / col][middle % col];

			if (midVal < target) {
				left = middle + 1;
			} else if (midVal > target) {
				right = middle - 1;
			} else if (midVal == target) {
				return true;
			}

		}
		return false;
	}
}