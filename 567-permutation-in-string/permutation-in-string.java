class Solution {
	public boolean checkInclusion(String s1, String s2) {
	    if (s1.length() > s2.length()) return false;

	    int[] cArray = new int[26];
	    int[] cRunner = new int[26];

	    for (char c : s1.toCharArray()) {
	        cArray[c - 'a']++;
	    }

	    int l = 0, r = 0;

	    while (r < s2.length()) {
	        char rChar = s2.charAt(r);
	        cRunner[rChar - 'a']++;

	        if ((r - l + 1) < s1.length()) {
	            r++;
	            continue;
	        }

	        if (Arrays.equals(cArray, cRunner)) {
	            return true; // Return true if arrays are equal
	        }

	        char lChar = s2.charAt(l);
	        cRunner[lChar - 'a']--;
	        l++;
	        r++;
	    }

	    return false;
	}

}