class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] r = new int[nums1.length];
        int counter = 0;
        int counter2 = 0;
        int lastCount = 0;

        // for (int i = 0; i < nums1.length; i++)  r[i] = -1;
    
        for (int i = 0; i < nums1.length; i++) {
            boolean check = false;
            r[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (!check && nums1[i] == nums2[j]) check = true;

                if (nums1[i] < nums2[j] && check) {
                    //System.out.println(nums1[i] + " " +  nums2[j]);
                    counter = j;
                    r[i] = nums2[j];
                    counter++;
                    break;
                }
            }
            check = false;
        }

        


        
        return r;
    }
}
