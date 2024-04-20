import java.util.Arrays;
import java.util.Collections;

class Solution {
    public void moveZeroes(int[] nums) {
       int[] r = new int[nums.length];
       int counter = 0;

       for (int i : nums) {
            if (i != 0)
            r[counter++] = i;
       }

       for (int i = 0; i < nums.length; i++) 
             nums[i] = r[i];
       
    }
}