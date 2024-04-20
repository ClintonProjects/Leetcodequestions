class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();
        for (String s : emails) {
            String e = s.split("@")[0];
            e = e.split("\\+")[0];
            e = e.replaceAll("\\.", "");
            hs.add(e + "@" + s.split("@")[1]);
        }
        return hs.size();
    }
}