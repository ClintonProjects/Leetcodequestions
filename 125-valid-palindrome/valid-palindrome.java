class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
		int N = s.length() - 1;
		int right = N;

		while (left <= right) {
            char lChar = Character.toLowerCase(s.charAt(left));
            char rChar = Character.toLowerCase(s.charAt(right));

            if (!Character.isLetterOrDigit(lChar)) {
                left++;
        	} else if (!Character.isLetterOrDigit(rChar)) {
                right--;
        	} else if (lChar != rChar) {
                return false;
			} else {
                left++;
                right--;
            }
		}

		return true;
    }
}