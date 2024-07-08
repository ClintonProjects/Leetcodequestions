class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();
        String e;

        for (String s : emails) {
            e = s.split("@")[0].split("\\+")[0];
            e = e.replaceAll("\\.", "");
            hs.add(e + "@" + s.split("@")[1]);
        }

        return hs.size();
    }
}