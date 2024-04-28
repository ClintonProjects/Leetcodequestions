class Solution {
    public long zeroFilledSubarray(int[] nums) {
        //This actually took me less then 30 seconds , O.O
        
        long counter = 0;
        long max = 0; 

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                counter++;
            } else { 
                counter = 0;
            }

            max += counter;
        }

        return max;
    }
}