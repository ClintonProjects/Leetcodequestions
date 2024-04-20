class Solution {
    public int[] replaceElements(int[] arr) {
        int[] r = new int[arr.length];
        r[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--)  {
            if ( arr[i+1] < r[i+1]) {
                r[i] = r[i+1];
            } else {
                r[i] = arr[i+1];               
            }
        }
                
        return r;
    }
}