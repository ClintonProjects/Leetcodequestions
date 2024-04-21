class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] r = new int[nums1.length];
        int counter = 0;
        boolean check = false;
        Arrays.fill(r, -1);
     
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!check && nums1[i] == nums2[j]) check = true;
                if (nums1[i] < nums2[j] && check) {
                    r[i] = nums2[j];
                    counter = ++j;
                    break;
                }
            }
            check = false;
        }
        return r;
    }
}
