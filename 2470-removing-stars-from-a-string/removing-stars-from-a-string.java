class Solution {
    public String removeStars(String s) {
        Stack<Character> cStack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c != '*') {
                cStack.push(c);
            } else {
                cStack.pop();
            }
        } 

        StringBuilder sb = new StringBuilder();
        for (char e : cStack) {
            sb.append(e);
        }
        
        return sb.toString();
    }
}