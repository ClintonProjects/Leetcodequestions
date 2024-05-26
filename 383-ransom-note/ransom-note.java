class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] ranArray = new int[26];

        for (int i = 0; i < Math.max(ransomNote.length(), magazine.length()); i++) {
            if (i < ransomNote.length()) ranArray[ransomNote.charAt(i) - 'a']++;
            if (i < magazine.length()) ranArray[magazine.charAt(i) - 'a']--;
        }

        Arrays.sort(ranArray);
        if (ranArray[25] > 0) return false;

        return true;
    }
}
