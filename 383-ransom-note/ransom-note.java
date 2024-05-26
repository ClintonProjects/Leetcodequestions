class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ranArray = new int[255];

        for (char c : magazine.toCharArray()) 
        ranArray[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
        int r = ranArray[c - 'a']--;
        System.out.println(r);
        if (r < 1)
        return false;
        }

        return true;
    }
}
