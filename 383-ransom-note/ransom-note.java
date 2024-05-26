class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ranArray = new int[255];
        
        for (int i = 0; i < Math.max(ransomNote.length(), magazine.length()); i++) {
            if (i < ransomNote.length())
            ranArray[ransomNote.charAt(i) - 'a']++;
            if (i < magazine.length())
            ranArray[magazine.charAt(i) - 'a']--;
        }

        Arrays.sort(ranArray);

        if (ranArray[254] > 0)
        return false;

        // for (int i : ranArray) {
        //     if (i > 0)
        //     return false;
        // }

        return true;
    }
}
