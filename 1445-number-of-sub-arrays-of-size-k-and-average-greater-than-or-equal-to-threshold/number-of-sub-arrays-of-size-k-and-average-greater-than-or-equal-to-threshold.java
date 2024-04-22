class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int start;
        int end;
        start = 0;
        end = k - 1;
        int total = 0;
        int subArrays = 0;

        for (int i = 0; i < end; i++)
        total += arr[i];

        //System.out.println("total: " + total + " end " + end);

        while (end < arr.length) {
            total += arr[end];
            //System.out.println(total);
            if (total / k >= threshold)
            subArrays++;

            total -= arr[start];
            
            
            start++;
            end++;

            // System.out.println("start: " + start);
            // System.out.println("end: " + end);
        }

        return subArrays;
    }
}