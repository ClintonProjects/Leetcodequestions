class NumArray {

    int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    public int sumRange(int left, int right) {
        int r = 0;
        for (int i = left; i <= right; i++) {
            r += nums[i];
        }
        return r;
    }
}