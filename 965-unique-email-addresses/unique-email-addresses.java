class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();

        for (String email : emails) {
            String[] parts = email.split("@");
            parts[0] = parts[0].replaceAll("\\.", "");
            if (parts[0].contains("+")) {
            parts[0] = parts[0].split("\\+")[0];
            }
            
            hs.add(parts[0] + "@" + parts[1]);
        }

        return hs.size();
    }
}