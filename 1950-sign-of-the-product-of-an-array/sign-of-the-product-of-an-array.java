class Solution {

    public int arraySign(int[] nums) {
        int cur = 1;
        for (int i : nums) {
        if (i == 0) return 0;
        
        if (i > 0) cur *= 1; 
        else if (i < 0) cur *= -1; 
        }

        return cur;
    }
}
