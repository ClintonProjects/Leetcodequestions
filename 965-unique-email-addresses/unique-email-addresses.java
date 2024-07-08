class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> hs = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (String email : emails) {
            String[] parts = email.split("@");
            
            for (char c : parts[0].toCharArray()) {
                if (c == '.')
                continue;
                if (c == '+')
                break;
                sb.append(c);
                
            }
            hs.add(sb.toString() + "@" + parts[1]);
            sb = new StringBuilder();
        }

        return hs.size();
    }
}