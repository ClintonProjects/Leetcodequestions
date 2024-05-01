class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i = m - 1;
        // int j = n - 1;
        // int k = m + n - 1;

        for (int i = m; i < nums1.length; i++) {
            int t = nums2[i - m];
            nums1[i] = t;
        }

        Arrays.sort(nums1);

    }
}