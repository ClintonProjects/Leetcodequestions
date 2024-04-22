class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
          Stack<Integer> cStack = new Stack<Integer>();
          
          int N = pushed.length, M = popped.length;
          int j = 0;

          for (int i : pushed) {
            cStack.push(i);

            while(!cStack.isEmpty() && cStack.peek() == popped[j]) {
            cStack.pop();
            j++;
            }
          }

       
        return cStack.isEmpty();
    }
}