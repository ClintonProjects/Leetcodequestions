import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

class Solution {

    public String kthLargestNumber(String[] nums, int k) {
        if (nums.length < k)
            return null;

        BigInteger[] r = new BigInteger[nums.length];

        for (int i = 0; i < nums.length; i++)
            r[i] = new BigInteger(nums[i]);

        Arrays.sort(r, Collections.reverseOrder());

        return String.valueOf(r[k - 1]);
    }
}